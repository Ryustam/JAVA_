package DTO;

public class character {
	private String ID;
	private String name;
	private int Lv;
	private double attack;
	private double defense;
	private double attack_speed;
	private double HP;
	
	public character(String ID, String name, int Lv, double attack, double defense, 
			double attack_speed,double HP) {
		this.ID=ID;
		this.name=name;
		this.Lv=Lv;
		this.attack=attack;
		this.defense=defense;
		this.attack_speed=attack_speed;
		this.HP=HP;
	}
	
	public String getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	public int getLv() {
		return this.Lv;
	}
	public double getAttack() {
		return this.attack;
	}
	public double getdefense() {
		return this.defense;
	}
	public double getAttack_speed() {
		return this.attack_speed;
	}
	public double getHP() {
		return this.HP;
	}
}
