package test;

//�������� ���������� public�� 
public class test_public {

		private int num;
		//private ���� ���� �����ڸ� ����ؼ�
		//�����͸� �ܺηκ��� ����
		// ������ �ܺ����� ������ ���������� �����ϴ°�
		public test_public() {
			//����Ʈ ������
			num =0;
		}
		
		//�Է��� �ִ� ������
		public test_public(int num) {
			this.num=num;
		}
		
		public void showNum() {
			System.out.printf("num:%d\n", num);
		}
		
}
