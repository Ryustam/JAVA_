
class BBB{
	private int num;
	public BBB() {
		num=0;
	}
	
	public BBB(int num) {
		this.num=num;
	}
	
	public void showNum() {
		System.out.printf("num:%d\n",num);
	}
	//static ���̸� ��ü �������ص� �ǰ� �̹� ������� �ִ�.
	public static void staticMethod() {
		System.out.println("Static!");
	}
}
// static�� ��ü�� �����Ǳ� ���� �̹� �޸𸮿� �����Ǿ� ����.

public class class_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BBB b =new BBB(3);
		b.showNum();
		
		//� Ŭ���� ������ static�޼����
		//Ŭ�����̸�. �޼���
		BBB.staticMethod();
		//BBB.showNum();
		//�Ϲݸ޼���� �ݵ�� ��ü ������ �ؾ�
		//�޼��尡 �޸𸮿� �ε�Ǵϱ�
		//�׶����� �޼��带 ����� �� �ִ�.
		//static�޼���� static���� ������� ���
		
		//showNum�� non-static�޼���
		//staticMethod�� static�޼���
		
		//��ǥ���� Ŭ����2��
		//non-static�޼���� ����� Ŭ����
		//Scanner Ŭ����
		//Scanner Ŭ������ �޼������ ��κ� non-static
		//�ݵ�� ��ü �����ؾ� �޼��� ��밡��
		
		//Math Ŭ����
		//MathŬ������ �޼����� ��κ� static
		
		
		
	}

}
