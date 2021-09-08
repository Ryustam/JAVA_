package practice;

import java.util.Scanner;

class weather{
	private int month;
	
	weather(int month){
		this.month=month;
	}
	
	public void showInfo() {
		switch(month) {
		case 12,1,2:
			System.out.println("지금은 겨울입니다.");
			break;
		case 3,4,5:
			System.out.println("지금은 봄입니다.");
			break;
		case 6,7,8:
			System.out.println("지금은 여름입니다.");
			break;
		case 9,10,11:
			System.out.println("지금은 가을입니다.");
			break;
		
		
		}
	}
	
}

public class ex3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월입니까?");
		weather s1 = new weather(sc.nextInt());
		s1.showInfo();
		
		sc.close();
	}

}
