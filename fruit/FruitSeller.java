package fruit;

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
		int apple=money/APPLE_PRICE;
		if(this.numOfApple>=apple){
			numOfApple -= apple;
			myMoney += money;	
			return apple;
		}else {
			return 0;
		}
	}
	
	
	
	public void showSaleResult()
	{
		System.out.println("***�Ǹ��� ��Ȳ***");
		System.out.println("���� ���:"+numOfApple);
		System.out.println("�Ǹ� ����:"+myMoney);
	}
}
