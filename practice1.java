import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		
		int num =0;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수를 입력하시오");
		num= sc.nextInt();
		
		if(num %2 == 0) {
			System.out.printf("%d:짝수\n",num);
		}else {
			System.out.printf("%d:홀수\n",num);
		}
		
		sc.close();
	}

}
