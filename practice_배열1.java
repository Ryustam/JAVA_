import java.util.Scanner;

public class practice_�迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num;
		Scanner sc= new Scanner(System.in);
		
		int arr[] = new int[9];
		
		System.out.println("������ �Է��ϼ���.���?");
		num=sc.nextInt();
		for(i=0;i<9;i++) {
			arr[i]=num*(i+1);
		}
		
		for(i=0;i<9;i++) {
			System.out.printf("%d ",arr[i]);
		}
		
		sc.close();
		
	}

}
