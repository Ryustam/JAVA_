package car_manage;

class Truck1 extends Vehicle1{
	private String name;
	private String provider;
	private int price;
	private boolean navi;
	private int load;
	
	Truck1(){
		
	}
	
	Truck1(String ID,String name, String provider, int price,boolean navi,int load){
		super(ID,name,provider,price);
		this.navi=navi;
		this.load=load;
	}	
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("네이게이션:%b\n",this.navi);
		System.out.printf("적재량:%d\n",this.load);
	}
}

