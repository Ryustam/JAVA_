package fruit_revised;

class FruitSeller{
	private final int APPLE_PRICE=1000;
	private int numOfApple;
	private int myMoney;
	
	public FruitSeller() {
		numOfApple=10;
		myMoney=0;
	}
	
	public FruitSeller(int numOfApple,int myMoney) {
		this.numOfApple=numOfApple;
		this.myMoney=myMoney;
	}
	
	public int saleApple(int money)
	{
		int num=money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult()
	{
		System.out.println("***판매자 현황***");
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익:"+myMoney);
	}

	public boolean checkApple(int money) {
		//매개변수가 받은 금액만큼 사과 판매가 가능한지 체크
		//money가 사과 몇갠지?
		int num=money/APPLE_PRICE;
		if(num>numOfApple) {
		//구매자가 구매하려는 사과갯수가, 
		//판매자가 판매할수있는 사과 갯수보다 많으니까 판매 불가능
			return false;
		}
		//그게 아니면 구매가능
		return true;
	}
}