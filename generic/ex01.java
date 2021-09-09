package generic;

class AAA<T>{
	public T num;
}


public class ex01 {

	public static void main(String[] args) {
		AAA<Integer>a =new AAA<Integer>();
		
		a.num=10;
		System.out.println(a.num);

	}

}
