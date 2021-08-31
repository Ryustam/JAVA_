
public class practice_method4 {

	public static void main(String[] args) {
	
	min_GB(6,9);
		
	}
	
	public static void min_GB(int num1, int num2) {
		
		int i;
		int S=  (num1 > num2) ? num2 : num1;
		int L = (num1 > num2) ? num1 : num2;
		
		for (i=L;i<S*L;i++) {
			if(i%S==0 && i%L==0) {
				System.out.printf("%d과%d의 최소공배수는%d",num1,num2,i);
				break;
			}
		}
		
	}

}
