package Inheritance;

//오버로딩
//메소드 오버로딩:method overloading
//메소드 과적하는것 
//매개변수 타입이나 갯수만 다른 메서드를 여러개 정의 가능하다


//오버라이딩
//부모 클래스가 물려준 메서드를, 자식 클래스가 재정의하는것
//오버라이딩은 반드시 상속이 있어야만 가능한 문법
//상속이 안되있으면 오버라이딩이란것 자체가 없다.
//override : ~보다 우선시하다
//부모가 물려준 메소드를 자식이 재성의 했을때
//자식이 재정의한 메서드가 우선시된다.
//부모의 원래 메서드는 가려진다


class myAnimal {
	public void sound() {
		System.out.println("울음소리 모름!");
	}
}

//부모가 준 것을 재정의해야한다.
//부모의 sound메서드를 그대로 쓰면 안되니까 내가 재정의했다.
class myDog extends myAnimal {
	
	@override //annotation
	public void sound() {
		System.out.println("울음소리 멍멍!");
	}
}

class myCat extends myAnimal {
	public void sound() {
		System.out.println("울음소리 야옹!");
	}
}

public class inherit_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myDog dog = new myDog();
		dog.sound();
		
		myCat cat = new myCat();
		cat.sound();
	}

}
