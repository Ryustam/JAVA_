package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		String word="";
		int len=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("길이입력:");
		len=sc.nextInt();
		sc.nextLine();
		
		System.out.printf("문자열 %d개 입력\n",len);
		for(int i=1; i<=len;i++) {
			word=sc.nextLine();
			arrayList.add(word);
		}
		System.out.printf("문자열 %d개 출력\n",len);
		for(int i=0; i<arrayList.size();i++) {
			word=arrayList.get(i);
			System.out.println(word);
		}
		
		
	}

}
