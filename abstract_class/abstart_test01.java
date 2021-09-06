package abstract_class;


//추상 클래스
abstract class Animal{

	public abstract void sound(); 
	//추상메서드
	//실체가 없는 메서드
	//body가 없는 메서드
	//추상메서드는 바디를 구체화하면 안된다.
	//추상 메서드는 기능을 만들면 안된다.
	public void hello() {
		System.out.println("안녕");
	}
}

class Lion extends Animal{
	//추상 클레스에게 물려받은 추상메서드는
	//그걸 물려받은 클래스가 반드시 오버라이딩 해야한다.
	public void sound() {
		System.out.println("어흥!");
	}
}

public class abstart_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
