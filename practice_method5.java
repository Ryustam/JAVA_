import java.util.Scanner;

import Class_object.ex3;


public class practice_method5 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	
	System.out.printf("%d까지의 소수는\n", num);
	sosu(num);
	
	
	sc.close();
	
	}

	
	public static void sosu(int num1) {
		
		int i,j,k=0;
		int count1=0,count2=0;
		int arr[] = new int[100];
		
		for (i=1;i<=num1;i++) {
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count1++;
				}
			}
			if(count1==2) {
				arr[k]=i;
				count2++;
				k++;
			}
			count1 = 0;
		}
		for (i=0;i<count2;i++) {
			System.out.printf("%d ",arr[i]);
		}

	}
}


/*
 for (i=0;i<100;i++) {
			if(arr[i]==0) {
				break;
			}
			System.out.printf("%d ",arr[i]);
		}
*/