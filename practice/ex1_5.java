package practice;

import java.util.Scanner;

class box{
	int index;
	String A;
	boolean code=false;

	public String getA() {
		return A;
	}
	
	box(){
	}
	
	box(String text,int index){
		this.index=index;
		this.A=text;
	}
	
	public void showInfo() {
		System.out.printf("'%s'는 %d번째에서 처음 등장합니다.\n",this.A,this.index+1);
	}
}


public class ex1_5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String text[] = new String[20];
		System.out.println("텍스트를 입력하세요.");
		text=sc.next().split("");
		
		box s1[] = new box[text.length];
	
		for(int i=0;i<text.length;i++) {
			s1[i]=new box(text[i],i);
			for(int j=0;j<i;j++) {
				if(s1[j].getA().equals(s1[i].getA())==true) {
					s1[i].code=true;
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
