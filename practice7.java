import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,num=0,sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.printf("���� �ϳ��� �Է��ϼ���.\n");
		num=sc.nextInt();
		
		for(i=1;i<num;i++) {
			if(num%i==0){
				sum+=i;
			}		
		}
		
		if(sum==num) {
			System.out.printf("%d�� �������Դϴ�.",num);
		}else {
			System.out.printf("%d�� �������� �ƴմϴ�.",num);
		}
		
		sc.close();
		
	}

}
