package test;


//�������� ������: ������ ������ ����Ұ��ΰ�?
class test_default {
	private int num; //�������
	
	//������:��ü�� �����ɶ� ȣ��Ǵ� ��� 
	//����Ʈ ������ (�Է��� ���� ������)
	public test_default() {
			
	}
	//�Է��� �ִ� ������
	public test_default(int num) {
		this.num=num;
		//this���� ���� ��ü�� �ּ�
	}
	public void showNum() {
		System.out.printf("num:%d\n",num);
	}
	
}
