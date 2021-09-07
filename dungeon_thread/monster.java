package dungeon_thread;

import java.util.Random;

class monster implements Runnable {
	private String name;
	private int HP;
	private int attack;
	private user user;
	
	
	
	
	monster(String name, int HP,int attack,user user){
		this.name=name;
		this.HP=HP;
		this.attack=attack;
		this.user=user;
	}
	
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP=HP;
	}
	
	public void damage(user user) {
		user.setHP(user.getHP()-this.attack);
	}
	
	public void run() {
	
		//Thread클래스에게 상속받은 run메서드를 오버라이딩한다.
		Random rand = new Random();
		System.out.println(name+"가 나타났다!");
		int wait = 0;
		
		try {
			
			for(int i=0;i<=10;i++) {
				wait+=rand.nextInt(150)+1;
				System.out.println(user.getEscape());
				if(user.getEscape()>100) {
					System.out.println("용사가 도망갔다!");
					break;
				} else if(wait>50) {
					System.out.printf("%s가 %s를 공격했다. ",this.name,user.getname());
					damage(user);
					System.out.printf(" 남은체력:%s\n",user.getHP());
					wait=0;
				}
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		
		}
		System.out.println(this.name+"스레드 동작 종료...");
	}

	
}
