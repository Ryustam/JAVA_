import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum=0;
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է��ϼ���");
			num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			sum += num;
		}
		
		System.out.printf("�Է¹��� ������ ��:%d\n",sum);
		sc.close();
	}

}
