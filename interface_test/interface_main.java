package interface_test;


//인터페이스는 극단적인 형태의 추상클래스
//추상 클래스는 1개 이상의 추상메서드를 가지면 되고
//추상 클래스는 추상메서드+일반메서드 가능함
//인터페이스는 무조건 추상메서드만 있어야한다.
//인터페이스는 바디를 포함하는 일반메서드가 존재하면 안된다.
interface RemoteController{
	
	public static final int volume=50;
	public abstract void turnOn();
	public abstract void turnOff();
}

//implement: 구현하다.
//인터페이스:종이
//클래스: 설계도
//객체 : 건물


class TV implements RemoteController{
		public void turnOn() {
			System.out.println("TV켠다!");
		}
		public void turnOff() {
			System.out.println("TV끈다!");
		}
		
}


public class interface_main {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
	}

}
