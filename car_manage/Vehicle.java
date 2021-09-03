package car_manage;

class Vehicle1{
	private String ID;
	private String name;
	private String provider;
	private int price;
	
	Vehicle1(){
	}
	
	Vehicle1 (String ID,String name, String provider, int price){
		this.ID=ID;
		this.name=name;
		this.provider=provider;
		this.price=price;
	}
	
	public String getID() {
		return this.ID;
	}	
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void finalize() {
		try {
			super.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	
	public void showInfo() {
		System.out.printf("등록아이디:%s\n",this.ID);
		System.out.printf("차량이름:%s\n",this.name);
		System.out.printf("제조사:%s\n",this.provider);
		System.out.printf("가격:%d\n",this.price);
	}
	
}
