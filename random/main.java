package random;

import java.util.Random;
import java.util.Scanner;



class RockCissorPaper{
	
	Random rand = new Random();
	//private Random rand; 랜덤객체 저장을 위한 참조변수
	
	private int win;
	private int lose;
	private int draw;
	private int count;
	
	private int hands;
	//1-가위
	//2-바위
	//3-보
	
	RockCissorPaper(){
		//rand =new Random();
		//new가 들어간다. 객체 생성, 인스턴스 생성
		//클래스가 실체화 된다.
		
		this.hands=rand.nextInt(3)+1;
		this.win=0;
		this.lose=0;
		this.draw=0;
		this.count=0;
		
	}
	
	public void reroll() {
		this.hands=rand.nextInt(3)+1;
	}
	
	public void setHands(int num) {
		this.hands=num;
	}
	
	
	public void fight(RockCissorPaper man) {
		if(this.hands ==man.hands) {
			//비김
			this.count++;
			this.draw++;
			man.reroll();
			System.out.println("비겼습니다.");
			
			
		}else if(this.hands ==1 && man.hands==2) {
			//패배
			this.count++;
			this.lose++;
			man.reroll();
			System.out.println("나(가위):상대(바위) 졌습니다.");
			
		}else if(this.hands ==1 && man.hands==3) {
			//승리
			this.count++;
			this.win++;
			man.reroll();
			System.out.println("나(가위):상대(보) 이겼습니다.");
			
		}else if(this.hands ==2 && man.hands==1) {
			//승리
			this.count++;
			this.win++;
			man.reroll();
			System.out.println("나(바위):상대(가위) 이겼습니다.");
			
		}else if(this.hands ==2 && man.hands==3) {
			//패배
			this.count++;
			this.lose++;
			man.reroll();
			System.out.println("나(바위):상대(보) 졌습니다.");
			
		}else if(this.hands ==3 && man.hands==1) {
			//패배
			this.count++;
			this.lose++;
			man.reroll();
			System.out.println("나(보):상대(가위) 졌습니다.");
			 
		}else if(this.hands ==3 && man.hands==2) {
			//승리
			this.count++;
			this.win++;
			man.reroll();
			System.out.println("나(보):상대(바위) 이겼습니다.");
		}else if (this.hands==4) {
			this.showInfo();
		}
	}
	
	public void showInfo() {
		System.out.printf("시행 수:%d\n",this.count);
		System.out.printf("승리:%d\n",this.win);
		System.out.printf("패배:%d\n",this.lose);
		System.out.printf("비김:%d\n",this.draw);
		System.out.printf("승률:%.2f%%\n",(double)this.win/this.count*100);
	}

	
	
}

public class main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		RockCissorPaper me = new RockCissorPaper();
		RockCissorPaper com = new RockCissorPaper();
		
		boolean code=true;
		String agree;
		
		
		do {
			System.out.println("가위바위보!!");
			System.out.println("1.가위");
			System.out.println("2.바위");
			System.out.println("3.보");
			System.out.println("4.결과 확인");
			
			me.setHands(sc.nextInt());
			me.fight(com);
			
			
		
			System.out.println("계속 하시겠습니까? (Y/N)");
			agree=sc.next();
			if(agree.equals("N")||agree.equals("n")) {
				code=false;
				me.showInfo();
			}
			
		}while(code);
		
	}

}
