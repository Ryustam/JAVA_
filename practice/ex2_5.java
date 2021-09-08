package practice;

import java.util.Scanner;

class box1{
	String A;
	boolean code=false;
	int count=1;

	public String getA() {
		return A;
	}
	
	box1(String text){
		this.A=text;
	}
	
	public void showInfo() {
		System.out.printf("'%s'는 %d글자입니다.\n",this.A,this.count);
	}
}


public class ex2_5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String text[] = new String[20];
		System.out.println("텍스트를 입력하세요.");
		text=sc.next().split("");
		
		box1 s1[] = new box1[text.length];
	
		for(int i=0;i<text.length;i++) {
			s1[i]=new box1(text[i]);
			for(int j=0;j<i;j++) {
				if(s1[j].getA().equals(s1[i].getA())==true) {
					s1[i].code=true;
					s1[j].count++;
				}
			}
		}		
		for(int i=0;i<s1.length;i++) {
			if(s1[i].code==true) {
				continue;
			}
			s1[i].showInfo();
		}
		sc.close();
	}

}