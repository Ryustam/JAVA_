package dungeon_thread;

import java.util.Random;


class user implements Runnable {
	private String name;
	private static int HP;
	private static int escape;
	
	
	
	user(String name, int HP){
		this.name=name;
		this.HP=HP;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP=HP;
	}
	public String getname() {
		return this.name;
	}

	public int getEscape() {
		return escape;
	}
	public void setEscape(int num) {
		this.escape+=num;
	}
	
	public void run() {
		
		//Thread클래스에게 상속받은 run메서드를 오버라이딩한다.
		//public boolean code = true;
		Random rand = new Random();
		System.out.println(name+"님께서 던전에 입장하셨습니다.");

		try {
			
			for(int i=0;i<=10;i++) {
				setEscape(rand.nextInt(50)+1);
				System.out.println("탈출 중!"+getEscape());
				if(getEscape()>100) {
					System.out.println("던전을 탈출했다!");
					break;
				}
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println(this.name+"스레드 동작 종료...");
		}
	
	
}
