import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		int i=0,j=0;
		int num1=0,num2=0;
		int start,end;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("2~9까지 정수 중 2개의 정수를 입력하세요");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		start=(num1<num2)?num1:num2;
		end=(num1<num2)?num2:num1;
		
		
		for(i=start;i<=end;i++) {
			for(j=2;j<10;j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.print("\n");
		}

	}

}
