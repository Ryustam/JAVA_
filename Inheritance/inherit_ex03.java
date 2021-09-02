package Inheritance;


class Person{
	
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
	
}

class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
	
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}



public class inherit_ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.breath(); //부모에게 물려받은 메서드
		s1.learn();  //원래 내꺼
		
		Teacher t1 = new Teacher();
		t1.eat(); //부모에게 물려받은 메서드
		t1.teach(); //원래 내꺼
	}

}
