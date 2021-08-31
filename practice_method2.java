import java.util.Scanner;

public class practice_method2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		myMath num = new myMath();
		
		System.out.printf("%f", num.myPow(num1,num2));
		
	}
	
}
class myMath {
	
	public double myPow(double num1,double num2) {
	
		int i;
		double result=1;
		
		for (i=0; i<num2;i++) {
			result*=num1;
		}
	
		return result;
	}
}