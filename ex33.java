import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name ="";
		
		System.out.print("이름 입력:");
		name = sc.nextLine();
		
		System.out.printf("%s",name);
		//정수 입력은 nextInt()
		//실수 입력은 nextDouble()
		//문자열 입력은 next()
		//but, next는 공백이 들어가면 못받는다. 어떻게하면 공백을 받을 수 있을까?
		//nextLine() <- 공백이 들어간 문자열도 받을 수 있음
		
		
		sc.close();
		
		
	}

}
