import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name ="";
		
		System.out.print("�̸� �Է�:");
		name = sc.nextLine();
		
		System.out.printf("%s",name);
		//���� �Է��� nextInt()
		//�Ǽ� �Է��� nextDouble()
		//���ڿ� �Է��� next()
		//but, next�� ������ ���� ���޴´�. ����ϸ� ������ ���� �� ������?
		//nextLine() <- ������ �� ���ڿ��� ���� �� ����
		
		
		sc.close();
		
		
	}

}
