import java.util.Scanner;

public class practice_�迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int i=0;
		int arr[]= new int[5];
		
		
		for(i=0;i<3;i++) {
			System.out.println("������ ������ ���� �Է��Ͻÿ�");
			arr[i]=sc.nextInt();
		}
		
		arr[3]=arr[0]+arr[1]+arr[2];
		arr[4]=arr[3]/3;
		
		for(i=0;i<arr.length;i++) {
			System.out.printf("%d\n",arr[i]);
		}
		
		
	}

}
