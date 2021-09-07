package Tread_Practice;

import java.util.Random;

class horse extends Thread{
	
	Random random = new Random();
	private int num=0;
	private int distance=0;
	private boolean code=true;
	
	public horse(int num) {
		this.num+=num;
	}
	
	public void run() {
		//Thread클래스에게 상속받은 run메서드를 오버라이딩한다.
		System.out.println(num+"번 말 출발!");
		
		try {
			while(this.code) {
				this.distance+=random.nextInt(10)+1;
				System.out.printf("%d번 말 %dm 달림!\n",num,this.distance);
				if(this.distance>=100) {
					this.code=false;
				}
				
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num+"번 말 도착!");
	}
	
}


public class Thread_practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		horse s1 = new horse(1);
		horse s2 = new horse(2);
		
		s1.start();
		s2.start();
	}

}
