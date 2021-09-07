package Tread_Practice;

class ThreadTest extends Thread{
	//쓰레드기능, 동시동작 하고 싶은 그런 클래스가 있다?
	//Thread클래스를 상속받는다.
	//쓰레드는 프로세스 내부의 분리된 흐름
	private int num;
	
	
	public ThreadTest(int num) {
		this.num+=num;
	}
	
	public void run() {
		//Thread클래스에게 상속받은 run메서드를 오버라이딩한다.
		System.out.println(num+"번 쓰레드 동작 중...");
		
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(num+"번 쓰레드 동작 중..."+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num+"번 스레드 동작 종료...");
	}
	
}


public class Thread_ex01 {

	public static void main(String[] args) {
		
		ThreadTest test1 = new ThreadTest(1);
		ThreadTest test2 = new ThreadTest(2);
		test1.start();
		test2.start();
		//run메소드를 쓰레드 형태로 동작하게 한다.
		//프로세스 내부 흐름이 분리되어 실행되게 한다.
	}

}
