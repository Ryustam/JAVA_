import java.util.Scanner;

public class practice_�迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int arr1[][] = new int[3][4];
		double arr2[] = new double[3];
		int i=0,j=0;
		
		for(i=0;i<3;i++) {
			System.out.printf("%d��° �л��� ������ ������ �Է��ϼ���\n",i+1);
			for(j=0;j<3;j++) {
				if(j==0) {
					System.out.print("����:");
				}
				if(j==1) {
					System.out.print("����:");
				}
				if(j==2) {
					System.out.print("����:");
				}
				arr1[i][j]=sc.nextInt();
			}
			arr1[i][3]=arr1[i][0]+arr1[i][1]+arr1[i][2];
		}
		
		for(i=0;i<3;i++) {
			arr2[i]=arr1[i][3]/3;
		}
		
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				if(j==0) {
					System.out.printf("����: %d ",arr1[i][j]);
				}
				if(j==1) {
					System.out.printf("����:%d ",arr1[i][j]);
				}
				if(j==2) {
					System.out.printf("����:%d ",arr1[i][j]);
				}
				if(j==3) {
					System.out.printf("����: %d ",arr1[i][j]);
				}
			}
			System.out.printf("���: %.1f\n",arr2[i]);
		}
		
		sc.close();
		
	}

}
