package Police;

class Gun1{
	Gun1() {
		
	}
	public void Bang() {
		System.out.println("빵야!");
	}
}

class Police1 {
	//Has-A관계
	private Gun1 g; //Gun을 포함시켰다.
	public Police() {
		g=new Gun1();
	}
	
	public void Fire() {
		g.Bang();
	}
}


public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Police1 s1 =new Police1();
		s1.Fire();
	}

}
