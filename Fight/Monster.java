package Fight;

public class Monster {
	private String name;
	private int HP;
	private int damage;
	
	public Monster() {
		name="기본몬스터";
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
		System.out.printf("체력:%d\n",HP);
		System.out.printf("데미지:%d\n\n",damage);
	}
	
	
	public void Attact(Warrior man) {
		//mon.hp=mon.hp-damage;
		man.setHP(man.getHP()-damage);//공격
		//현재 몬스터 HP를 가져와서
		// 그 값에 전사의 데미지를 뺀값을
		//몬스터 HP로 셋팅한다.
		System.out.printf("%s가 %s를 공격! 데미지:%d\n",name,man.getName(),damage);
		state(man);
		System.out.printf("전사의 HP:%d\n\n", man.getHP());
	}
	
	
	public void state(Warrior man) {
		if(man.getHP()<0) {
			man.setHP(0);
		}
	}
	
	
	
	
	
}
