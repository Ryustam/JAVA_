

class AAA{
	private static int num;
	
	public AAA() {
		num++;
	}
	public void showNum() {
		System.out.printf("num:%d\n", num);
	}
}

public class class_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AAA a1= new AAA();
		AAA a2= new AAA();
		AAA a3= new AAA();
		
		a1.showNum();
		a2.showNum();
		a3.showNum();
		
		
	}
}

//static 멤버변수는 모든 객체가 공유
