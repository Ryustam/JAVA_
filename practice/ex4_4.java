package practice;

import java.util.Scanner;

public class ex4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sec=sc.nextInt();
		
		System.out.printf("%dmin %dsec",sec/60,sec%60);
		sc.close();
	}

}
