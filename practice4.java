
public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int sum1=0,sum2=0;
		
		while(i<=100) {
			if(i%2 == 0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
			i++;
		}
		System.out.printf("1~100까지 짝수의합:%d\n",sum1);
		System.out.printf("1~100까지 홀수의합:%d\n",sum2);
		
	}

}
