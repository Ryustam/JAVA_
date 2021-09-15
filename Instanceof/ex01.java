package Instanceof;

class sportsCar extends car{
	sportsCar(){}
}

class car{
	car(){}
}


public class ex01 {

	public static void main(String[] args) {
		sportsCar sc = new sportsCar();
		if(sc instanceof sportsCar) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(sc instanceof car) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(sc instanceof Object) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
