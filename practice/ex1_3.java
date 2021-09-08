package practice;

import java.util.Scanner;

public class ex1_3 {

	public static void main(String[] args) {

	heightAndAge();	
		
	}
	public static void heightAndAge() {
	
		double height;
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		System.out.println("키를 입력하세요");
		height = sc.nextDouble();
		
		System.out.printf("나이: %d  키: %.1f",age,height);
		
		sc.close();
	}
}
