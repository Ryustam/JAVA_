package Inheritance;

class myAAA{
	private int A_num;
	public myAAA() {
		A_num=0;
	}
	
	public myAAA(int A_num) {
		this.A_num=A_num;
	}
	
	
	public void AAA_Func() {
		System.out.printf("A_num:%d\n",A_num);
	}
}

class myBBB extends myAAA{
	//myBBB는 myAAA의 private 멤버변수를 상속받았다.
	private int B_num;
	public myBBB() {
		//부모가 물려준 멤버변수는 부모 생성자로 호출한다.
		super();
		//super만 쓰면 부모의 생성자호출
		//super.메서드이름 부모의 메서드 호출
		B_num=0;
	}
	
	public myBBB(int A_num, int B_num) {
		super(A_num);
		//부모의 int값 한개 받는 생성자 호출
		//상속과정에서 어떻게 초기화하는지 
		this.B_num=B_num;
		//부모한테 받은 멤버변수는 부모생성자로 처리하고
		//원래 내꺼는 내가 그냥 하던데로 하면된다.
		
	}
	public void BBB_Func() {
		AAA_Func(); //이름이 다르니까 super를 꼭 안써도 괝찮다.
		System.out.printf("B_num:%d\n",B_num);
	}
}

public class inherit_ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myBBB bbb = new myBBB(10,20);
		bbb.BBB_Func();
	}

}
