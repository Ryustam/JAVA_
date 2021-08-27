import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum=0;
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요");
			num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			sum += num;
		}
		
		System.out.printf("입력받은 정수의 합:%d\n",sum);
		sc.close();
	}

}
