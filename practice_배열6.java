import java.util.Scanner;

public class practice_배열6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[][]=new int[10][10];
		
		int height;
		int i=0,j=0;
		
		arr[0][0]=1;
		
		System.out.println("높이를 입력하세요.");
		height = sc.nextInt();	
		
		for(i=1;i<=height;i++) {
			for(j=0;j<i;j++) {
				if(j==0 || j==i+1) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}
		
		for(i=0;i<=height;i++) {
			for(j=0;j<i;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}

	}

}
