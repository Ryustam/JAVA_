package Fight;

public class Warrior {
	private String name;
	private int HP;
	private int damage;
	
	public Warrior() {
		name="�⺻����";
		HP=100;
		damage=10;
	}
	public Warrior(String name,int HP,int damage) {
		this.name=name;
		this.HP=HP;
		this.damage=damage;
	}
	
	public void setDamage(int num) {
		this.damage=num;
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
	

	
	public void Attact(Monster mon) {
		//mon.hp=mon.hp-damage;
		mon.setHP(mon.getHP()-damage);//����
		//���� ���� HP�� �����ͼ�
		// �� ���� ������ �������� ������
		//���� HP�� �����Ѵ�.
		System.out.printf("%s�� %s�� ����! ������:%d\n",name,mon.getName(),damage);
		state(mon);
		System.out.printf("������ HP:%d\n\n", mon.getHP());
	}
	
	public void state(Monster mon) {
		if(mon.getHP()<0) {
			mon.setHP(0);
		}
	}
	
	public void gameover(Monster mon) {
		if (this.getHP()==0) {
			System.out.printf("%s�� ü���� �� �Ͽ����ϴ�. �������� �й��Ͽ����ϴ�.\n",this.getName());
		}else if (mon.getHP()==0) {
			System.out.printf("%s�� ü���� �� �Ͽ����ϴ�. �������� �¸��Ͽ����ϴ�.\n",mon.getName());
		}
	}
	
}
