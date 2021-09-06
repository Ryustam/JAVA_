package Simple_Lotto;

import java.util.Random;

public class Lotto_by_teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int num=0;
		int lotto[] =new int[6];
		boolean isDuplicate=false;
		for(int i=0;i<=5;i++) {
			num=random.nextInt(45)+1;
			
				for(int j=0;j<i;j++) {
					if(lotto[j]==num) {
						isDuplicate=true;
						break;
					}
				}
				if (isDuplicate ==true) {
					i=i-1;
				} else if(isDuplicate ==false) {
					lotto[i]=num;
				}
				isDuplicate =false;
		}
		for(int i=0;i<=5;i++) {
			System.out.printf("%d ", lotto[i]);
		}
	}
}
