
public class practice2 {

	public static void main(String[] args) {
		
		int i=1;
		int sum1=0,sum2=0;
		
		while(i<=10) {
			if(i%2 == 0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
			i++;
		}
		
		System.out.printf("1~10���� ������ ¦������: %d\n",sum1);
		System.out.printf("1~10���� ������ Ȧ������: %d\n",sum2);
		
		
	}

}
