package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.character;
import DTO.item;
import DTO.login;

public class memberDAO {
	
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private ArrayList<character> dtos;
	private ArrayList<login> dtoslogin;
	private ArrayList<item> dtosItem;
	
	public memberDAO() {
		
		try {
			String user="system";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			//thin: 자바 에디션
			//localhost == 127.0.0.1 =me
			//1521 확인 하는 곳 C:\app\Ryustam\product\18.0.0 검색 tnsnames-> tnsnames에서 찾으면 됨
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,pw);
			st=con.createStatement();
			//
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 오류:"+e.getMessage());
		}
	}

	public ArrayList<character> getAllCharacter(String ID) {
		dtos = new ArrayList<character>();
		String SQL="SELECT * FROM character where ID=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String userID =rs.getString("ID");
				String name = rs.getString("name");
				int Lv = rs.getInt("LV");
				double attack = rs.getDouble("attack");
				double defense = rs.getDouble("defense");
				double attack_speed = rs.getDouble("attack_speed");
				double HP = rs.getDouble("HP");
				
				character VO= new character(userID,name,Lv,attack,defense,attack_speed,HP);
				dtos.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
	public ArrayList<character> getCharacter(String ID,String name) {
		dtos = new ArrayList<character>();
		String SQL="SELECT * FROM character where ID=? and name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String userID =rs.getString("ID");
				String username = rs.getString("name");
				int Lv = rs.getInt("LV");
				double attack = rs.getDouble("attack");
				double defense = rs.getDouble("defense");
				double attack_speed = rs.getDouble("attack_speed");
				double HP = rs.getDouble("HP");
				
				character VO= new character(userID,username,Lv,attack,defense,attack_speed,HP);
				dtos.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	
	
	public ArrayList<DTO.login> login(String ID) {
		dtoslogin = new ArrayList<DTO.login>();
		String PW="null";
		String SQL="select PW from log where ID=?";
		
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				PW=rs.getString("PW");	
				DTO.login VO=new login(ID,PW);
				dtoslogin.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtoslogin;
	}

	public void makeCharacter(String ID,String name) {
		
		String SQL="insert into character values(?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.setInt(3,1);
			pstmt.setDouble(4,100);
			pstmt.setDouble(5,100);
			pstmt.setDouble(6,20);
			pstmt.setDouble(7,100);
			
			
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteCharacter(String ID,String name) {
		String SQL="delete from character where ID=? and name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void deleteInven(String ID,String name) {
		String SQL="delete from inventory where ID=? and name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}public void deleteItem(String ID,String name) {
		String SQL="delete from item where userID=? and name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void levelUp(String name, int Lv) {
		String SQL="update Character set LV=? where name=?";
		
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1,Lv);
			pstmt.setString(2,name);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	public void getItem(ArrayList<item> dtosItem,String ID,String name) {
		String SQL="insert into item values(?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.setInt(3,dtosItem.get(0).getItemID());
			pstmt.setString(4,dtosItem.get(0).getType());
			pstmt.setDouble(5,dtosItem.get(0).getAttack());
			pstmt.setDouble(6,dtosItem.get(0).getdefense());
			pstmt.setDouble(7,dtosItem.get(0).getAttack_speed());
			pstmt.setDouble(8,dtosItem.get(0).getHP());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<item> getAllItem(String name) {
		dtosItem = new ArrayList<item>();
		String SQL="SELECT * FROM item where name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int itemID = rs.getInt("ID");
				String type =rs.getString("type");
				double attack = rs.getDouble("attack");
				double defense = rs.getDouble("defense");
				double attack_speed = rs.getDouble("attack_speed");
				double HP = rs.getDouble("HP");
				item VO= new item(itemID,type,attack,defense,attack_speed,HP);
				dtosItem.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtosItem;
	}
	
	public void itemDelete(int ID) {
		String SQL="delete from item where ID=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1,ID);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void itemEquip(String ID, String name, item item) {
		String SQL="insert into inventory values(?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.setInt(3,item.getItemID());
			pstmt.setString(4,item.getType());
			pstmt.setDouble(5,item.getAttack());
			pstmt.setDouble(6,item.getdefense());
			pstmt.setDouble(7,item.getAttack_speed());
			pstmt.setDouble(8,item.getHP());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int equipCheck(String ID,String name, item item) {
		String SQL="select count(*) from inventory where ID=? and name=? and type=?";
		int count=0;
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			pstmt.setString(3,item.getType());
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				count=rs.getInt("count(*)");	
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public void itemChange(String ID, String name, item item) {
		String SQL="update inventory set itemID=?,attack=?,"
				+ "defense=?,attack_speed=?,HP=? where ID=? and name=? and type=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1,item.getItemID());
			pstmt.setDouble(2,item.getAttack());
			pstmt.setDouble(3,item.getdefense());
			pstmt.setDouble(4,item.getAttack_speed());
			pstmt.setDouble(5,item.getHP());
			pstmt.setString(6,ID);
			pstmt.setString(7,name);
			pstmt.setString(8,item.getType());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public ArrayList<item> update(String ID,String name) {
		dtosItem = new ArrayList<item>();
		String SQL="select * from inventory where ID=? and name=?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,ID);
			pstmt.setString(2,name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int itemID = rs.getInt("itemID");
				String type =rs.getString("type");
				double attack = rs.getDouble("attack");
				double defense = rs.getDouble("defense");
				double attack_speed = rs.getDouble("attack_speed");
				double HP = rs.getDouble("HP");
				item VO= new item(itemID,type,attack,defense,attack_speed,HP);
				dtosItem.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtosItem;
	} 
	
}
