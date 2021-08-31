package fruit_revised;

class FruitBuyer{
	private int myMoney;
	private int numOfApple;
	
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
		if(money>myMoney) {
			//구매금액이 내가 가진돈보다 크면...
			System.out.println("돈이 부족합니다!");
			return;
		}
		//판매자의 사과갯수를 체크하여 판매가능한지...
		if(seller.checkApple(money)==true) {
			//구매가능
			numOfApple += seller.saleApple(money);
			myMoney -= money;
			System.out.printf("판매자에게 %d원치 사과를 구매했다!\n",money);
		}else {
			System.out.println("판매할 사과가 부족합니다!");
			return;
		}
	}

	public void showBuyResult()
	{
		System.out.println("***구매자 현황***");
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}