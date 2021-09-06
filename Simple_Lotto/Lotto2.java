package Simple_Lotto;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int num=0;
		int lotto[] =new int[6];
		
		for(int i=0;i<=5;i++) {
			num=random.nextInt(45)+1;
			if(i==0) {
				lotto[i]=num;
			} else {
				for(int j=0;j<i;j++) {
					if(lotto[j]==num) {
						i--;
						break;
					}
					lotto[i]=num;
				}
			}
		}
		for(int i=0;i<=5;i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}
