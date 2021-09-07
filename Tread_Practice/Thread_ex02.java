package Tread_Practice;

class ThreadTest2 implements Runnable{
	
	private int num;
	
	public ThreadTest2() {
		
	}
	public ThreadTest2(int num) {
		this.num=num;
	}
	
	public void run() {
		System.out.println(num+"번 쓰레드 동작 중...");
		try {
			for(int i=0;i<=10;i++) {
				System.out.println(num+"번 쓰레드 동작 중..."+i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(num+"번 쓰레드 동작 완료...");
	}
	
}


public class Thread_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Start main method");
		ThreadTest2 test1 = new ThreadTest2(1);
		ThreadTest2 test2 = new ThreadTest2(2);
		
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test2);
		
		t1.start();
		t2.start();
	}

}
