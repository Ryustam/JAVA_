package exception;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[3];
		
		try {
			arr[5]=3;
		}catch(ArithmeticException e) {
			System.out.println("산출 관련 벗어난오류!");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 벗어난오류!");
			e.printStackTrace();
		}finally {
			System.out.println("무조건");
		}
	}

}
