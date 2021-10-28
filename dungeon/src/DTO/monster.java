package DTO;

import java.util.Random;

public class monster {
	private double attack;
	private double defense;
	private double attack_speed;
	private double HP;
	private monster monster;
	
	public monster(double attack, double defense, double attack_speed, double HP) {
		this.attack=attack;
		this.defense=defense;
		this.attack_speed=attack_speed;
		this.HP=HP;
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
	
	public monster getMonster() {
		
		Random rand = new Random();
		
		double attack=rand.nextDouble()*1000;
		double defense=rand.nextDouble()*1000;
		double attack_speed=rand.nextDouble()*20;
		double HP=rand.nextDouble()*1000;
		
		monster VO= new monster(attack,defense,attack_speed,HP);
		return VO;
	}
}
