package nested;
//중첩클래스
//관련 있는 클래스를 중첩클래스로 묶을수 있다.
class Outer{
	private int out_num;
	public void outFunc() {
		System.out.println("outFunc");
	}
	class Inner{
		private int in_num;
		public void inFunc() {
			System.out.println("inFunc");
		}
	}
}

public class nested_test {

	public static void main(String[] args) {
		Outer out = new Outer(); //외부 클래스 객체 생성
		Outer.Inner in = out.new Inner();
		//내부클래스 객체 생성
 		
		//Outer 클래스 내부의 Inner클래스
			
		out.outFunc();
		in.inFunc();
		
		
	}

}
