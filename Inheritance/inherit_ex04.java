package Inheritance;

//자바는 다중상속이 불가능하다.


//final 클래스는 상속해줄 수 없다.

final class myFianl{
	public int num;
	public void Func() {
		System.out.println("myFinal");
	}
}

class myChild extends myFinal{
	//mychild는 myFinal의 서브 클래스가 될 수 없다.
	//->myFianl클래스는 fil클래스니까 상속해줄수 없다.
}



public class inherit_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
