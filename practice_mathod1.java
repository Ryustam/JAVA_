
public class practice_mathod1 {

	public static void main(String[] args) {
	
		int result = myAbs(-29);
		System.out.printf("%d\n", result);
		
	}
	
	
	public static int myAbs(int num) {
		
		int result= (num>0)?num:(num*-1);
		
		return result;
	}

}
