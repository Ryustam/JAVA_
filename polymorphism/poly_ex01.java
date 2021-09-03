package polymorphism;

//polymorphism
//다형성
//poly : 다양한

class Animal{
	public void sound() {
		System.out.println("울름소리 모름!");
	}
}
class Dog extends Animal{  //상속
	public void sound() {  //메소드 오버라이딩
		System.out.println("멍멍!");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("야옹!");
	}
}
class Frog extends Animal{
	public void sound() {
		System.out.println("개굴!");
	}
}


public class poly_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal ani = null;
		
		//Dog d = new Animal(); 이거는 안됨
		
		
		//ani= new Dog();
		//ani.sound();
		
		//ani= new Cat();
		//ani.sound();
		//ani= new Frog();
		//ani.sound();
		
		Animal ani[] = new Animal[3];
		ani[0] = new Dog();
		ani[1] = new Cat();
		ani[2] = new Frog();
		for (int i = 0; i<ani.length;i++){
			ani[i].sound();
			
		}
		
		
	
		//ani.sound 생긴건 똑같은데 다른 결과가 나온다.
		//코드는 똑같은데 다른 결과
		//이게 다형성
		//이걸 왜 쓰냐 - 가독성과 코드가 짧아짐
		
		//다형성의 장점
		//부모 타입 변수로 자식 객체들을 모두 사용할 수 있다.
		//다형성이 없다면
		//각각에 맞는 변수를 다 만들어야된다.
		//근데 부모타입 변수로 자식 객체를다 담을 수 있기 때문에
		//          
	}

}
//다형성은
//다양한 형태를 지닌다.
//다양한 형태를 지닐수 있는 이유가
//부모 타입 변수에 자식 객체들을 모두 담을수 있으니까
//부모 타입 변수에 어떤 자식 객체를 넣느냐에 따라서
//다양한 형태로 사용할 수 있다.


//자식 타입 변수에 부모 객체를 담을 수 없다.
// ex) Dog d = new Animal();

//부모 타입 변수에 자식 객체를 담을 수 있다.
//ex) Animal ani = new Dog(); 


