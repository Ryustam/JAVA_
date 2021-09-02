package car_ex;

class Car {
	private String name;
	private String provider;
	private int price;
	
	public String getName() {
		return name;
	}
	
	
	public Car(String name, String provider, int price) {
		this.name=name;
		this.provider=provider;
		this.price=price;
	}
	
	public void showInfo() {
		System.out.printf("차량명:%s\n",name);
		System.out.printf("제조사:%s\n",provider);
		System.out.printf("가격:%d\n",price);
	}
	
	
	
}
