import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,num=0,sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("정수 하나를 입력하세요.\n");
		num=sc.nextInt();
		
		for(i=1;i<num;i++) {
			if(num%i==0){
				sum+=i;
			}		
		}
		
		if(sum==num) {
			System.out.printf("%d는 완전수입니다.",num);
		}else {
			System.out.printf("%d는 완전수가 아닙니다.",num);
		}
		
		sc.close();
		
	}

}
