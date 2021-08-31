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
			System.out.println("������ �ִ� ���� �����մϴ�.");
			return;
		} else {
			box=seller.saleApple(money);
			switch(box) {
			case 0:
				System.out.println("����� �����Ͽ� �������� ���߽��ϴ�.");
				break;
			default:
				numOfApple += box;
				myMoney -= money;
				System.out.printf("�Ǹ��ڿ��� %d��ġ ����� �����ߴ�!\n",money);
				break;
			}
		}
	}
	//�Ǹ��� Ŭ������ buyApple�޼��� ���η�
	//������ ��ü�� ������ͼ�
	//������ ��ü�� saleApple�޼��带 ����Ѱ�
	//
	
	public void showBuyResult()
	{
		System.out.println("***������ ��Ȳ***");
		System.out.println("���� �ܾ�:"+myMoney);
		System.out.println("��� ����:"+numOfApple);
	}
}