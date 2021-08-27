import java.util.Scanner;

public class practice_배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double arr[] = new double[3];
		double sum=0;
		
		System.out.println("온도를 세번 입력하세요");
		for(int i=0;i<3;i++) {
			System.out.printf("%d번째 온도:",i+1);
			arr[i]=sc.nextDouble();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.printf("%.1f",sum/3);
		
		sc.close();
		
		
		
		
	}

}
