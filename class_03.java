
class BBB{
	private int num;
	public BBB() {
		num=0;
	}
	
	public BBB(int num) {
		this.num=num;
	}
	
	public void showNum() {
		System.out.printf("num:%d\n",num);
	}
	//static 붙이면 객체 생성안해도 되고 이미 만들어져 있다.
	public static void staticMethod() {
		System.out.println("Static!");
	}
}
// static은 객체가 생성되기 전에 이미 메모리에 생성되어 있음.

public class class_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBB b =new BBB(3);
		b.showNum();
		
		//어떤 클래스 내부의 static메서드는
		//클래스이름. 메서드
		BBB.staticMethod();
		//BBB.showNum();
		//일반메서드는 반드시 객체 생성을 해야
		//메서드가 메모리에 로드되니까
		//그때부터 메서드를 사용할 수 있다.
		//static메서드는 static쓰는 방법으로 써라
		
		//showNum은 non-static메서드
		//staticMethod는 static메서드
		
		//대표적인 클래스2개
		//non-static메서드로 도배된 클래스
		//Scanner 클래스
		//Scanner 클래스의 메서드들은 대부분 non-static
		//반드시 객체 생성해야 메서드 사용가능
		
		//Math 클래스
		//Math클래스의 메서들은 대부분 static
		
		
		
	}

}
