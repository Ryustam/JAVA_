package Random_Practice;

import java.util.Random;
//java 패키지 안에 util패키지 안에 random클래스
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int num=0;
		for(int i=1;i<5;i++) {
			num=rand.nextInt(3)+1;
			System.out.printf("%d",num);
		}
	}

}
