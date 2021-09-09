package toString;

class AAA{
	private int x;
	private int y;
	
	
	public AAA(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	public  String toString() {
		return "AAA:"+"x:"+x+"y:"+"y";
	}
	
}

//모든 클래스의 조상은 Object클래스다
//어떤 클래스라도 이미 Object클래스한테 상속받은 상태

public class ex01 {

	public static void main(String[] args) {
		
		AAA obj1 = new AAA(5,4);
		AAA obj2 = new AAA(6,8);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		//클래스 이름@해시코드
		//AAA클래스로 만든 객첸데...
		//해시코드는 암호화된 값...구분하는 역할
		//서로 다른 객체다 라는것
		
		
		
		
	}

}
