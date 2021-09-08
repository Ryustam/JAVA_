package practice;

import java.util.Scanner;

public class ex4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[5];
		int max=0;
		int min=0;
		
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번째 숫자 입력:");
			arr[i]=sc.nextInt();
			if(i==0) {
				min=arr[i];
				max=arr[i];
			}else {
				min=(arr[i]<min)? arr[i]:min;
				max=(arr[i]>max)? arr[i]:max;
			}
			
		}
		
		System.out.printf("최댓값: %d\n",max);
		System.out.printf("최솟값: %d\n",min);
		
		
		sc.close();
		
	}

}
