package Fight;

public class Warrior {
	private String name;
	private int HP;
	private int damage;
	
	public Warrior() {
		name="기본전사";
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
		System.out.printf("체력:%d\n",HP);
		System.out.printf("데미지:%d\n\n",damage);
	}
	

	
	public void Attact(Monster mon) {
		//mon.hp=mon.hp-damage;
		mon.setHP(mon.getHP()-damage);//공격
		//현재 몬스터 HP를 가져와서
		// 그 값에 전사의 데미지를 뺀값을
		//몬스터 HP로 셋팅한다.
		System.out.printf("%s가 %s를 공격! 데미지:%d\n",name,mon.getName(),damage);
		state(mon);
		System.out.printf("몬스터의 HP:%d\n\n", mon.getHP());
	}
	
	public void state(Monster mon) {
		if(mon.getHP()<0) {
			mon.setHP(0);
		}
	}
	
	public void gameover(Monster mon) {
		if (this.getHP()==0) {
			System.out.printf("%s의 체력이 다 하였습니다. 전투에서 패배하였습니다.\n",this.getName());
		}else if (mon.getHP()==0) {
			System.out.printf("%s의 체력이 다 하였습니다. 전투에서 승리하였습니다.\n",mon.getName());
		}
	}
	
}
