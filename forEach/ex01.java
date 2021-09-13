package forEach;

public class ex01 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30};
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d",arr[i]);
		}
		//for-each문 또는 강화된 for문
		for(int num:arr) {
			System.out.printf("%d",num);
		}
		

	}

}
