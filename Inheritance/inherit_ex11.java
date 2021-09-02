package Inheritance;

class Car {
	private String name;
	private String provider;
	private int price;
	
	
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

public class inherit_ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car carArray[] = new Car[3]; //Car 타입 객체 3개 저장
		
		carArray[0] = new Car("소나타","현대",3000);
		carArray[1] = new Car("아반떼","현대",2500);
		carArray[2] = new Car("투싼","현대",3500);
		
		for(int i=0;i<carArray.length;i++) {
			carArray[i].showInfo();
		}
		
		//int arr[] =new int[3];
		// 참조 배열 ,객체 배열
		//Car타입 배열
		//Car객체의 주소가 저장되는 배열
		
		
	}

}
