import java.util.Scanner;

public class practice_�迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double arr[] = new double[3];
		double sum=0;
		
		System.out.println("�µ��� ���� �Է��ϼ���");
		for(int i=0;i<3;i++) {
			System.out.printf("%d��° �µ�:",i+1);
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.printf("%.1f",sum/3);
		
		sc.close();
		
		
		
		
	}

}
