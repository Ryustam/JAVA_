package Inheritance;

//상속관계에서
//부모 클래스, 자식 클래스
//Parents, children
//Super, Sub(하위)
//base(기본,기초), Derrived(파생된)

//IS-A관계
//사람을 학생에게 물려준다.
//사람을 경찰관에게 물려준다.
//개는 동물이다-O Dog is a animal
//동물은 개다_X

//Animal을 dog,cat,frog에게 상속해준다.
// Car를 sportscar,truck에게 상속해준다.
//공통기능을 물려준다

class Animal{
	public String name;
	public void Sound() {
		System.out.println("울음소리");
	}
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}


public class inherit_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
