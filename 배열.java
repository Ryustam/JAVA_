
public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바의 배열은 객채이다(변수+함수)
		int arr1[]= new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i=0;i<arr1.length;i++) {
			System.out.printf("%d", arr1[i]);
		}
	}

}
