package polymorphism;

class A{
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}

public class poly_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new B();
		obj.methodA();
	}

}
