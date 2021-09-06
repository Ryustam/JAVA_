package palindrome;

import java.util.Scanner;

public class palin_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력.:");
		str=sc.next();
		//회문판별
		String str1[]=str.split("");
		Boolean palin =false;
		
		System.out.println(str1.length);
		
		for(int i=0;i<str1.length/2;i++) {
			if(str1[i].equals(str1[(str1.length-1)-i])) {
				palin=true;
			}else {
				palin=false;
			}
		}
		
		if(palin==true) {
			System.out.printf("%s는 회문이다.",str);		
		} else {
			System.out.printf("%s는 회문이 아니다.",str);	
		}
		
		
		
	}

}
