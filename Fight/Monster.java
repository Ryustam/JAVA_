package Fight;

public class Monster {
	private String name;
	private int HP;
	private int damage;
	
	public Monster() {
		name="�⺻����";
		HP=20;
		damage=5;
	}
	public Monster(String name,int HP,int damage) {
		this.name=name;
		this.HP=HP;
		this.damage=damage;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP=HP;
	}
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.printf("ü��:%d\n",HP);
		System.out.printf("������:%d\n\n",damage);
	}
	
	
	public void Attact(Warrior man) {
		//mon.hp=mon.hp-damage;
		man.setHP(man.getHP()-damage);//����
		//���� ���� HP�� �����ͼ�
		// �� ���� ������ �������� ������
		//���� HP�� �����Ѵ�.
		System.out.printf("%s�� %s�� ����! ������:%d\n",name,man.getName(),damage);
		state(man);
		System.out.printf("������ HP:%d\n\n", man.getHP());
	}
	
	
	public void state(Warrior man) {
		if(man.getHP()<0) {
			man.setHP(0);
		}
	}
	
	
	
	
	
}
