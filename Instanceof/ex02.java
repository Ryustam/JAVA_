package Instanceof;

class MysportsCar extends Mycar{
	MysportsCar(){}
}

class Mycar{
	Mycar(){}
}


public class ex02 {

	public static void main(String[] args) {
		Mycar sc = new Mycar();
		if(sc instanceof MysportsCar) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(sc instanceof Mycar) {
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
