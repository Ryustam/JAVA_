

public class preex1 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		int i;
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(i=2;i<10;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for(i=0;i<10;i++) {
			System.out.printf("%d ",arr[i]);
		}
		
	}

}
