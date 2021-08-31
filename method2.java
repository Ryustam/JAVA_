
public class method2 {

	public static void main(String[] args) {
		int a= myAbs(10);
		System.out.println(a);

	}
	
	public static int myAbs(int num) {
		if(num>=0) {
			return num;
		} else {
			return num*-1;
		}
	}

}
