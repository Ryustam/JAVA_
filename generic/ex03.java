package generic;

class CCC<T,U>{
	private T num1;
	private U num2;
	
	public CCC() {
		
	}
	
	public CCC(T n1, U n2) {
		num1=n1;
		num2=n2;
	}
	
	public void showInfo() {
		System.out.println("info1:"+num1);
		System.out.println("info2:"+num2);
	}
	
}


public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCC<String,Integer>c=new CCC<String,Integer>("송중기",20);
		c.showInfo();
	}

}
