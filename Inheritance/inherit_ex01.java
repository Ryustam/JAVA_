package Inheritance;

//상속 inheritance

//상속은 물려주는것
//부모 클래스, 자식 클래스
//부모 클래스가 자식 클래스에게 상속해준다.
//부모 클래스가 가지고 있던 모든것들이 자식 클래스에 추가된다
//그리고 부모 자식관계로 연결되고
//상속-오버라이딩-다형성 이건 세트로 줄줄이 연결된다.

class AAA{
	public int A_num;
	public void AAA_Func() {
		System.out.println("AAA");
	}
}

//BBB클래스가 AAA클래스에게 상속받는다.
//BBB클래스가 자식 클래스
//AAA클래스가 부모 클래스
//extend - 확장한다.
//BBB는 AAA클래스를 이용해서 확장한다.
//공통기능을 부모클래스에 만들어놓고
//자식클래스들에게는 공통기능을 주입시키기만 하면된다.

//학생, 직장인, 소방관, 경찰은 모두 사람이다.
//사람클래스를 만들어서
//학생, 직장인, 소방관, 경찰관 클래스에게 상속해주면된다.

class BBB extends AAA{
	public int B_num;
}

///CCC클래스는 AAA클래스에게 상속받는다.

class CCC extends AAA{
	public int C_num;
}


//상속을 해주면 부모의 기능을 모두 물려받을수있으므로
//코드가 재사용되어 코드가 확연히 줄어들고 가독성이 좋아진다.

//상속을 해주면 뭐가 좋은가?
//1.재사용. 2+알파
//2.+알파 : 오버라이딩, 다형성이 적용될수 있어서 코드 가독성, 유지 보수성 좋아짐



public class inherit_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b = new BBB();
		b.A_num=10;
		b.B_num=20;
		
		CCC c = new CCC();
		c.A_num=10; //부모한테 받은것
		c.C_num=30; //원래 내꺼
		c.AAA_Func(); //부모한테 받은것
	}

}
