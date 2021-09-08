package practice;

import java.util.Scanner;

public class ex1_3 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
	double height;
	int age;
		
	System.out.println("나이를 입력하세요");
	age = sc.nextInt();
	System.out.println("키를 입력하세요");
	height = sc.nextDouble();	
	byEveryone(age,height);
	
	sc.close();
		
	}
	public static void byEveryone(int age, double height) {
		System.out.printf("나이: %d  키: %.1f",age,height);
	}
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	
}
