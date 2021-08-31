
public class practice_method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	maxGongY(6,9);
		
	}

	public static void maxGongY(int num1, int num2) {
		boolean code=true;
		
		int S=  (num1 > num2) ? num2 : num1;
		int L = (num1 > num2) ? num1 : num2;
		int temp=0;
		int GCD=0;
		
		while (code) {
			if (L % S != 0) {
				temp = S;
				S = L % S;
				L = temp;
			}
			if (L % S == 0) {
				GCD = S;
				System.out.printf("두 수의 최대공약수: %d\n", GCD);
				code = false;
			}
		}	
	}
	

}
	
