import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		
		int num =0;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�");
		num= sc.nextInt();
		
		if(num %2 == 0) {
			System.out.printf("%d:¦��\n",num);
		}else {
			System.out.printf("%d:Ȧ��\n",num);
		}
		
		sc.close();
	}

}
