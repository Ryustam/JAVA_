package fruit;

class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	private int box;
	public FruitBuyer()
	{
		myMoney=5000;
		numOfApple=0;
	}
	public FruitBuyer(int myMoney,int numOfApple)
	{
		this.myMoney=myMoney;
		this.numOfApple=numOfApple;
	}
	
	public void buyApple(FruitSeller seller, int money)
	{
		if(money>this.myMoney) {
			System.out.println("가지고 있는 돈이 부족합니다.");
			return;
		} else {
			box=seller.saleApple(money);
			switch(box) {
			case 0:
				System.out.println("사과가 부족하여 구매하지 못했습니다.");
				break;
			default:
				numOfApple += box;
				myMoney -= money;
				System.out.printf("판매자에게 %d원치 사과를 구매했다!\n",money);
				break;
			}
		}
	}
	//판매자 클래스의 buyApple메서드 내부로
	//구매자 객체를 끌고들어와서
	//구매자 객체의 saleApple메서드를 사용한것
	//
	
	public void showBuyResult()
	{
		System.out.println("***구매자 현황***");
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}