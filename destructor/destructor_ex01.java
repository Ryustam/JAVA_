package destructor;


//소멸자
//소멸자는 생성자의 반대
//생성자: 객체가 생성될때 호출되는것
//소멸자: 객체가 소멸될때 호출되는것

//object 클래스는 모든 클래스의 조상

class AAA {
	private int num;
	public void showInfo() {
		
	}
	public void finalize() {
		try {
			super.finalize();
			System.out.println("소멸자 호출");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}



public class destructor_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AAA aaa= new AAA();
		aaa=null; //aaa에 객체의 주소가 있었는데
		//널값을 넣어서 객체와 연결을 끊었다.
		//그 객체가 쓸모없어졌다. 왜냐면
		// 그 객체를 참조하는 변수가 없어지니까 쓸모없어진것
		System.gc();//가비지 켈렉터 호출
		//시스템 클래스 내부의 gc메서드
		//gc- garbage collector
		//쓰레기차 호출
		
		
	}

}
