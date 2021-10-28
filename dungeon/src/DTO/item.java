package DTO;

import java.util.ArrayList;
import java.util.Random;

public class item {
	
	static int level=0;
	
	private ArrayList<item> dtosItem;
	private String type;
	private double attack;
	private double defense;
	private double attack_speed;
	private double HP;
	private item item;
	private int itemID;
	private String ID;
	
	public item() {
		
	}
	
	public item(int itemID,String type, double attack, double defense, double attack_speed, double HP) {
		this.itemID=itemID;
		this.type=type;
		this.attack=attack;
		this.defense=defense;
		this.attack_speed=attack_speed;
		this.HP=HP;
	}
	
	public int getItemID() {
		return this.itemID;
	}
	
	public String getType() {
		return this.type;
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
	
	public ArrayList<item> getItem() {
		dtosItem=new ArrayList<item>();
		Random rand = new Random();
		int temp;
		switch (temp=rand.nextInt(3)) {
			case 0:
				this.type="sword";
				break;
			case 1:
				this. type="helmet";
				break;
			case 2: 
				this.type="Armor";
				break;	
		}
		int itemID=level;
		double attack=rand.nextDouble()*100;
		double defense=rand.nextDouble()*100;
		double attack_speed=rand.nextDouble()*5;
		double HP=rand.nextDouble()*100;
		
		item VO=new item(itemID,type,attack,defense,attack_speed,HP);
		dtosItem.add(VO);
		level+=1;
		return dtosItem;
	}
	
}
