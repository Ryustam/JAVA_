package generic;

class BBB<T>{
	public T num;
	
	public void set(T n) {
		num=n;
	}
	
	public T get() {
		return num;
	}
}


public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB<Double>b =new BBB<Double>();
		
		b.set(3.14);
		double result = b.get();
		System.out.println(result);
		
	}

}
