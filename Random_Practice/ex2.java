package Random_Practice;

import java.util.Random;
import java.util.Scanner;
//java 패키지 안에 util패키지 안에 random클래스
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int num=0;
		int count =0;
		
		count= sc.nextInt();
		
		int dice[] = new int[7];
		double dice_per[] = new double[7];		
		for(int i=1;i<count;i++) {
			num=rand.nextInt(6)+1;
			dice[num]++;
		}
		//
		for(int i=1; i<=6; i++) {
			dice_per[i]=((double)dice[i]/count)*100;
		}
		
		for (int i=1;i<=6;i++) {
			System.out.printf("%d의 눈금:%d\n",i,dice[i]);
			System.out.printf("%d의 확률:%.3f%%\n",i,dice_per[i]);
		}
		
		//대수의 법칙, 큰수의 법칙
		//주사위 각 눈금이 나올 확률 1.6
		///100번 던지면,
		//대수의법칙: 이론상의 확률은 시행횟수를 늘리면 가까워진다.
	}

}