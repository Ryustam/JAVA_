package Inheritance;


class myPerson{
	
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

class myStudent extends myPerson{
	void learn() {
		System.out.println("배우기");
	}
	void say() {
		System.out.println("선생님 안녕하세요");
	}
	
}

class Leader extends myStudent{
	void lead() {
		
	}
	void say() {
		//오버라이딩
		System.out.println("선생님께 인사");
		super.say();
	}
	
}


class myTeacher extends myPerson{
	void teach() {
		System.out.println("가르치기");
	}
}



public class inherit_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leader s1 = new Leader();
		s1.say();
	}

}
