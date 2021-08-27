import java.util.Scanner;
//java 패키지 안에 util 패키지 안에 Scanner 클래스를 가져온다
public class scanner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner 클래스를 가져와서 객체를 생성하고, 내장 메서드를 사용하면된다
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=sc.nextInt();
		System.out.printf("num:%d\n",num);
		//클래스는 변수와 함수가 들어있는 곳
		//객체는 클래스가 메모리에 생성된 것
		
		//Scanner sc
		// 객체의 주소가 저장되는 변수
		//참조변수, 객체변수
		
		//new는 메모리 생성 연산자
		//new Scanner <-- Scanner 클래스로 메모리 생성한다.
		//Scaaner클래스를 메모리에 실체화한다.
		
		//System.in 시스템입력
		
	}

}
