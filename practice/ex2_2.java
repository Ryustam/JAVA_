package practice;

import java.util.Scanner;

class ddi {
	
	private int year;
	
	ddi(int year){
		this.year=year;
	}
	
	public void yearCalc() {
		switch(year%12) {
		case 1:
			System.out.println("당신은 닭띠입니다.");
			break;
		case 2:
			System.out.println("당신은 개띠입니다.");
			break;
		case 3:
			System.out.println("당신은 돼지띠입니다.");
			break;
		case 4:
			System.out.println("당신은 쥐띠입니다.");
			break;
		case 5:
			System.out.println("당신은 소띠입니다.");
			break;
		case 6:
			System.out.println("당신은 호랑이띠입니다.");
			break;
		case 7:
			System.out.println("당신은 토끼띠입니다.");
			break;
		case 8:
			System.out.println("당신은 용띠입니다.");
			break;
		case 9:
			System.out.println("당신은 뱀입니다.");
			break;
		case 10:
			System.out.println("당신은 말띠입니다.");
			break;
		case 11:
			System.out.println("당신은 양띠입니다.");
			break;
		case 0:
			System.out.println("당신은 원숭이띠입니다.");
			break;
		}
	}
	
	
}

public class ex2_2 {

	public static void main(String[] args) {
		
		//나머지 9는 뱀
		//나머지 1는 닭
		//나머지 0는 원숭이
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("출샌년도를 입력하세요.");
		year=sc.nextInt();
		
		ddi s1 = new ddi(year);
		s1.yearCalc();
		sc.close();
	}

}
