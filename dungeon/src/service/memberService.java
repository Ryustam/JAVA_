package service;

import java.util.ArrayList;

import DAO.memberDAO;
import DTO.character;
import DTO.item;
import DTO.login;

public class memberService {
	private memberDAO DAO;
	protected  ArrayList<DTO.item> dtosItem;
	item makeItem = new item();
	
	public memberService() {
		DAO=new memberDAO();
	}
	
	public ArrayList<character> getAllMembers(String ID) {
		return DAO.getAllCharacter(ID);
	}
	public ArrayList<character> getCharacter(String ID,String name) {
		return DAO.getCharacter(ID,name);
	}
	
	public ArrayList<login> login(String ID){
		return DAO.login(ID);
	}
	
	public void makeCharacter(String ID,String name) {
		DAO.makeCharacter(ID,name);
	}

	public int deleteCharacter(String ID,String name) {
		DAO.deleteCharacter(ID,name);
		DAO.deleteInven(ID,name);
		DAO.deleteItem(ID,name);
		return 0;
	}

	public int levelUp(String name,int Lv) {
		DAO.levelUp(name,Lv);
		return 0;
	}
	public ArrayList<item> getAllItem(String name){
		return DAO.getAllItem(name);
	}
	public int getItem(String ID,String name) {
		dtosItem=makeItem.getItem();
		DAO.getItem(dtosItem,ID,name);
		return 0;
	}
	
	public int itemDelete(int ID) {
		DAO.itemDelete(ID);
		return 0;
	}

	public int itemEquip(String ID,String name,item item) {
		int temp = DAO.equipCheck(ID,name,item);
		if(temp ==0) {
			DAO.itemEquip(ID,name,item);
			return 0;
		}else {
			DAO.itemChange(ID,name,item);
			return 1;
		}
	}
	
	public ArrayList<item> update(String ID, String name) {
		return dtosItem=DAO.update(ID, name);
	}
	
	
}
