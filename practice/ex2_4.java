package practice;

import java.util.Scanner;




public class ex2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		
		char myChars[] = s1.toCharArray();
		
		for(int i=0;i<myChars.length;i++) {
			code(myChars[i]);
		}
		sc.close();
	}
	public static void code(char mychar) {
		if(mychar=='a') {
			System.out.print('ㄱ');
		}
		if(mychar=='b') {
			System.out.print('ㄴ');
		}
		if(mychar=='c') {
			System.out.print('ㄷ');
		}
		if(mychar=='d') {
			System.out.print('ㄹ');
		}
		if(mychar=='e') {
			System.out.print('ㅁ');
		}
		if(mychar=='f') {
			System.out.print('ㅂ');
		}
		if(mychar=='g') {
			System.out.print('ㅅ');
		}
		if(mychar=='h') {
			System.out.print('ㅇ');
		}
		if(mychar=='i') {
			System.out.print('ㅈ');
		}
		if(mychar=='j') {
			System.out.print('ㅊ');
		}
		if(mychar=='k') {
			System.out.print('ㅋ');
		}
		if(mychar=='l') {
			System.out.print('ㅌ');
		}
		if(mychar=='m') {
			System.out.print('ㅍ');
		}
		if(mychar=='n') {
			System.out.print('ㅎ');
		}
		if(mychar=='o') {
			System.out.print('ㅏ');
		}
		if(mychar=='p') {
			System.out.print('ㅑ');
		}
		if(mychar=='q') {
			System.out.print('ㅓ');
		}
		if(mychar=='r') {
			System.out.print('ㅕ');
		}
		if(mychar=='s') {
			System.out.print('ㅗ');
		}
		if(mychar=='t') {
			System.out.print('ㅛ');
		}
		if(mychar=='u') {
			System.out.print('ㅜ');
		}
		if(mychar=='v') {
			System.out.print('ㅠ');
		}
		if(mychar=='w') {
			System.out.print('ㅡ');
		}
		if(mychar=='x') {
			System.out.print('ㅣ');
		}
	}
}
