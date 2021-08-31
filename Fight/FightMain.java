package Fight;

public class FightMain {

	public static void main(String[] args) {
		
		Warrior man= new Warrior();
		Monster mon = new Monster();
		man.setDamage(15);
		
		man.showInfo();
		mon.showInfo();
		
		boolean manHP=true;
		boolean monHP=true;
		
		while(manHP && monHP) {
			man.Attact(mon);
			mon.Attact(man);
			man.gameover(mon);
			manHP= (man.getHP()==0)? false : true ;
			monHP= (mon.getHP()==0)? false : true ;
		}
		
	

	}

}
