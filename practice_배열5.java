import java.util.Scanner;

public class practice_배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int arr1[][] = new int[3][4];
		double arr2[] = new double[3];
		int i=0,j=0;
		
		for(i=0;i<3;i++) {
			System.out.printf("%d번째 학생의 국영수 성적을 입력하세요\n",i+1);
			for(j=0;j<3;j++) {
				if(j==0) {
					System.out.print("국어:");
				}
				if(j==1) {
					System.out.print("영어:");
				}
				if(j==2) {
					System.out.print("수학:");
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
					System.out.printf("국어: %d ",arr1[i][j]);
				}
				if(j==1) {
					System.out.printf("영어:%d ",arr1[i][j]);
				}
				if(j==2) {
					System.out.printf("수학:%d ",arr1[i][j]);
				}
				if(j==3) {
					System.out.printf("총점: %d ",arr1[i][j]);
				}
			}
			System.out.printf("평균: %.1f\n",arr2[i]);
		}
		
		sc.close();
		
	}

}
