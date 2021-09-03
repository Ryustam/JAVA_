package car_manage;

class Car1 extends Vehicle1{
	private String name;
	private String provider;
	private int price;
	private boolean navi;	
	
	Car1(){
		
	}
	
	Car1(String ID, String name, String provider, int price,boolean navi){
		super(ID,name,provider,price);
		this.navi=navi;
	}	
	
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("네이게이션:%b\n",this.navi);
	}
	
}
