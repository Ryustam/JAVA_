package controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet.ColorAttribute;

import com.sun.tools.javac.Main;

import DTO.*;
import service.*;


public class homeController {
	
	
	public static void main(String[] args) {
		new login_main();
	}
}

class login_main{
	
	protected boolean success=false;
	protected ArrayList<character> dtos;
	protected ArrayList<DTO.login> dtoslogin;
	protected ArrayList<item> dtosInven;
	protected AbstractTableModel model;
	protected String[][] contents;
	
	
	public login_main() {
		memberService ser = new memberService();
		Dimension dim = new Dimension(520,220);
		JFrame frame = new JFrame("Dungeon");
		frame.setLocation(500,500);
		frame.setPreferredSize(dim);
		
		JPanel login = new JPanel();
		JLabel ID =new JLabel("ID : ");
		JLabel PW = new JLabel("PassWord : ");
		JTextField txtID = new JTextField(10);      // 여기서 숫자 10은 칸수를 의미한다.  
		JPasswordField txtPW = new JPasswordField(10);
		
		String header[]= {"캐릭터명","레벨","공격력","방어력","공격속도","체력"};
		String contents[][] = new String[5][6];
		JTable table = new JTable(contents,header);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		JScrollPane scrollpane = new JScrollPane(table);
		
		JButton logBtn = new JButton("Log in");
		logBtn.addActionListener( new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	dtoslogin=ser.login(txtID.getText());
		        String input_ID=txtID.getText();
		        String input_PW=txtPW.getText();
		        if(dtoslogin.size()==0) {
		        	JOptionPane.showMessageDialog(null, "없는 아이디입니다.", "Message",JOptionPane.ERROR_MESSAGE);
		        }
		        for(int i=0;i<dtoslogin.size();i++) {
		        	if(dtoslogin.get(i).getID().equals(input_ID)) {
		        		if(dtoslogin.get(i).getPW().equals(input_PW)) {
		        			JOptionPane.showMessageDialog(null, "로그인 성공!", "Message",JOptionPane.INFORMATION_MESSAGE);
		        			success=true;
		        			dtos=ser.getAllMembers(input_ID);
		        			if(dtos.size()!=0) {
		        				for(int j=0;j<dtos.size();j++) {
		        					dtosInven=ser.update(txtID.getText(),dtos.get(j).getName());
		        					double hp=0.0,attack1=0.0,defense1=0.0,as=0.0;
		        					if(dtosInven.size()!=0) {
			        					for(int k=0;k<dtosInven.size();k++) {
			        						hp+=dtosInven.get(k).getHP();
			        						attack1+=dtosInven.get(k).getAttack();
			        						defense1+=dtosInven.get(k).getdefense();
			        						as+=dtosInven.get(k).getAttack_speed();
			        					}
		        					}
		        					contents[j][0]=dtos.get(j).getName();
		        					contents[j][1]=String.valueOf(dtos.get(j).getLv());
		        					contents[j][2]=String.valueOf(dtos.get(j).getAttack()+attack1);
		        					contents[j][3]=String.valueOf(dtos.get(j).getdefense()+defense1);
		        					contents[j][4]=String.valueOf(dtos.get(j).getAttack_speed()+as);
		        					contents[j][5]=String.valueOf(dtos.get(j).getHP()+hp);
		        				}
		        				
		        				frame.repaint();
		        				table.setVisible(true);
		        			}
		        		}else {
		        			JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "Message",JOptionPane.ERROR_MESSAGE);
		        		}	
		        	}
		        }  
		     } 
		});
		
		JButton logOutBtn = new JButton("Log out");
		logOutBtn.addActionListener(new ActionListener() {
		     

			public void actionPerformed(ActionEvent e) {
		    	 txtID.setText(null);
		    	 txtPW.setText(null);
		    	
		    	 for(int i=0;i<5;i++) {
		    		contents[i][0]="";
		    		contents[i][1]="";
		    		contents[i][2]="";	
		    		contents[i][3]="";
		    		contents[i][4]="";
		    		contents[i][5]="";
		    	 } 
		    	 success=false;
		    	 frame.repaint();
 				table.setVisible(true);
		     }
		});
		login.add(ID);
		login.add(txtID);
		login.add(PW);
		login.add(txtPW);
		login.add(logBtn);
		login.add(logOutBtn);
		
	
		JPanel crud = new JPanel();
		
		JButton newCharacter = new JButton("캐릭터 생성");
		newCharacter.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	 if(success==true) {
		    		 String input1 = JOptionPane.showInputDialog("닉네임을 입력하세요");
		    		 ser.makeCharacter(txtID.getText(), input1);
		    		 dtos=ser.getAllMembers(txtID.getText());
		    		 if(dtos.size()!=0) {
	        				for(int j=0;j<dtos.size();j++) {
	        					dtosInven=ser.update(txtID.getText(),dtos.get(j).getName());
	        					double hp=0.0,attack1=0.0,defense1=0.0,as=0.0;
	        					if(dtosInven.size()!=0) {
		        					for(int k=0;k<dtosInven.size();k++) {
		        						hp+=dtosInven.get(k).getHP();
		        						attack1+=dtosInven.get(k).getAttack();
		        						defense1+=dtosInven.get(k).getdefense();
		        						as+=dtosInven.get(k).getAttack_speed();
		        					}
	        					}
	        					contents[j][0]=dtos.get(j).getName();
	        					contents[j][1]=String.valueOf(dtos.get(j).getLv());
	        					contents[j][2]=String.valueOf(dtos.get(j).getAttack()+attack1);
	        					contents[j][3]=String.valueOf(dtos.get(j).getdefense()+defense1);
	        					contents[j][4]=String.valueOf(dtos.get(j).getAttack_speed()+as);
	        					contents[j][5]=String.valueOf(dtos.get(j).getHP()+hp);
	        				}
	        				
	        				frame.repaint();
	        				table.setVisible(true);
	        			}
		    	 }else {
						JOptionPane.showMessageDialog(null, "로그인이 필요합니다.", "Message",JOptionPane.ERROR_MESSAGE);
					}
		     }
		});
		JButton deleteCharacter = new JButton("캐릭터 삭제");
		deleteCharacter.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select=table.getSelectedRow();
				int temp=0;
				if(success==true) {
					temp=ser.deleteCharacter(txtID.getText(),dtos.get(select).getName());
		    		dtos=ser.getAllMembers(txtID.getText());
	        			if(dtos.size()!=0) {
	        				for(int j=0;j<dtos.size();j++) {
	        					contents[j][0]=dtos.get(j).getName();
	        					contents[j][1]=String.valueOf(dtos.get(j).getLv());
	        					contents[j][2]=String.valueOf(dtos.get(j).getAttack());
	        					contents[j][3]=String.valueOf(dtos.get(j).getdefense());
	        					contents[j][4]=String.valueOf(dtos.get(j).getAttack_speed());
	        					contents[j][5]=String.valueOf(dtos.get(j).getHP());
	        				}
	        				for(int i=dtos.size();i<5;i++) {
	        					contents[i][0]=" ";
	        					contents[i][1]=" ";
	        					contents[i][2]=" ";
	        					contents[i][3]=" ";
	        					contents[i][4]=" ";
	        					contents[i][5]=" ";
	        				}
	        				
	        			}else {
	        				for(int i=0;i<5;i++) {
	        					contents[i][0]=" ";
	        					contents[i][1]=" ";
	        					contents[i][2]=" ";
	        					contents[i][3]=" ";
	        					contents[i][4]=" ";
	        					contents[i][5]=" ";
	        				}
	        			}
	        			
	        			frame.repaint();
        				table.setVisible(true);
		    	 }	else {
						JOptionPane.showMessageDialog(null, "로그인이 필요합니다.", "Message",JOptionPane.ERROR_MESSAGE);
				}
		     }
		});
		
		JButton gameStart = new JButton("게임 시작");
		gameStart.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(success==true) {
					int select=table.getSelectedRow();
				
					new inGame(dtos.get(select),txtID.getText());
				}else {
					JOptionPane.showMessageDialog(null, "로그인이 필요합니다.", "Message",JOptionPane.ERROR_MESSAGE);
				}
		     }
		});
		
		crud.add(newCharacter);
		crud.add(deleteCharacter);
		crud.add(gameStart);
		
		frame.add(login,BorderLayout.NORTH);
		frame.add(scrollpane,BorderLayout.CENTER);
		frame.add(crud,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

	
}

class inGame {
	protected ArrayList<DTO.item> dtosItem;
	protected ArrayList<DTO.item> dtosInven;
	protected ArrayList<character> dtos;
	protected Double userHP=0.0;
	protected Double userAttack=0.0;
	protected Double userdefense=0.0;
	protected Double userAttack_s=0.0;
	
	public inGame(character character,String ID) {
		memberService ser = new memberService();
		item makeItem = new item();
		Dimension dim = new Dimension(950,570);
		Dimension topD = new Dimension(80,30);
		JFrame frame = new JFrame("Dungeon");
		frame.setLocation(500,500);
		frame.setPreferredSize(dim);
		
		AbstractBorder border = new LineBorder(Color.black,1);
		
		double userHP=character.getHP();
		double userAttack=character.getAttack();
		double userdefense=character.getdefense();
		double userAttack_s=character.getAttack_speed();
		
		dtosInven=ser.update(ID,character.getName());
		if(dtosInven.size()!=0) {
			for(int i=0;i<dtosInven.size();i++) {
				userHP+=dtosInven.get(i).getHP();
				userAttack+=dtosInven.get(i).getAttack();
				userdefense+=dtosInven.get(i).getdefense();
				userAttack_s-=dtosInven.get(i).getAttack_speed();
			}
		}
		
		JPanel top= new JPanel();
		JLabel name =new JLabel(character.getName());
		name.setPreferredSize(topD);
		name.setBorder(border);
		name.setFont(new Font("바탕",Font.BOLD,16));
		name.setHorizontalAlignment(JLabel.CENTER);
		JLabel Lv = new JLabel("Lv:"+Integer.toString(character.getLv()));
		Lv.setPreferredSize(new Dimension(80,30));
		Lv.setBorder(border);
		Lv.setFont(new Font("바탕",Font.BOLD,16));
		Lv.setHorizontalAlignment(JLabel.CENTER);
		JLabel HP= new JLabel("HP:"+Double.toString(userHP));
		HP.setPreferredSize(new Dimension(80,30));
		HP.setBorder(border);
		HP.setFont(new Font("바탕",Font.BOLD,16));
		HP.setHorizontalAlignment(JLabel.CENTER);
		JLabel attack = new JLabel("공격력:"+Double.toString(userAttack));
		attack.setPreferredSize(new Dimension(120,30));
		attack.setBorder(border);
		attack.setFont(new Font("바탕",Font.BOLD,16));
		attack.setHorizontalAlignment(JLabel.CENTER);
		JLabel defense = new JLabel("방어력:"+Double.toString(userdefense));
		defense.setPreferredSize(new Dimension(120,30));
		defense.setBorder(border);
		defense.setFont(new Font("바탕",Font.BOLD,16));
		defense.setHorizontalAlignment(JLabel.CENTER);
		JLabel attack_s = new JLabel("공격속도:"+Double.toString(userAttack_s));
		attack_s.setPreferredSize(new Dimension(120,30));
		attack_s.setBorder(border);
		attack_s.setFont(new Font("바탕",Font.BOLD,16));
		attack_s.setHorizontalAlignment(JLabel.CENTER);
		
		top.add(name);
		top.add(Lv);
		top.add(HP);
		top.add(attack);
		top.add(defense);
		top.add(attack_s);
		
		String header[]= {"타입","공격력","방어력","공격속도","체력"};
		String contents[][] = new String[20][5];
		JTable table = new JTable(contents,header);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		JScrollPane scrollpane = new JScrollPane(table);
		dtosItem=ser.getAllItem(character.getName());
		for(int i=0;i<dtosItem.size();i++) {
			contents[i][0]=dtosItem.get(i).getType();
			contents[i][1]=String.valueOf(dtosItem.get(i).getAttack());
			contents[i][2]=String.valueOf(dtosItem.get(i).getdefense());
			contents[i][3]=String.valueOf(dtosItem.get(i).getAttack_speed());
			contents[i][4]=String.valueOf(dtosItem.get(i).getHP());	
		}
		
		JPanel bottom= new JPanel();
		JButton adventure = new JButton("탐험");
		adventure.setPreferredSize(new Dimension(150,40));
		adventure.setFont(new Font("바탕",Font.BOLD,20));
		adventure.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "탐험 진행중...", "Message",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "탐험 완료!", "Message",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "탐험을 통해 경험치가 올랐습니다!", "Message",JOptionPane.INFORMATION_MESSAGE);
				int result = JOptionPane.showConfirmDialog(null, 
							"장비를 발견하였습니다. 획득하시겠습니까?", "Confirm", 
							JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					JOptionPane.showMessageDialog(null, "탐험 종료", "Message",JOptionPane.INFORMATION_MESSAGE);
				}else if(result == JOptionPane.YES_OPTION) {
					int temp=ser.getItem(ID,character.getName());
					dtosItem=ser.getAllItem(character.getName());
					for(int i=0;i<dtosItem.size();i++) {
						contents[i][0]=dtosItem.get(i).getType();
    					contents[i][1]=String.valueOf(dtosItem.get(i).getAttack());
    					contents[i][2]=String.valueOf(dtosItem.get(i).getdefense());
    					contents[i][3]=String.valueOf(dtosItem.get(i).getAttack_speed());
    					contents[i][4]=String.valueOf(dtosItem.get(i).getHP());	
					}
					dtos=ser.getCharacter(ID, character.getName());
					int temp1=ser.levelUp(character.getName(),dtos.get(0).getLv()+1);
					dtos=ser.getCharacter(ID, character.getName());
					Lv.setText("Lv:"+Integer.toString(dtos.get(0).getLv()));
					
					frame.repaint();
    				table.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "탐험 종료", "Message",JOptionPane.INFORMATION_MESSAGE);
				}
		     }
		});
		
		JButton goHome = new JButton("처음으로");
		goHome.setPreferredSize(new Dimension(150,40));
		goHome.setFont(new Font("바탕",Font.BOLD,20));
		goHome.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		    	frame.setVisible(false);
		     }
		});
		bottom.add(adventure);
		bottom.add(goHome);
		

		
		
		
		//ImagePanel man = new ImagePanel(new ImageIcon("./src/image/man.png").getImage());
		JPanel east= new JPanel();
		ImageIcon img = new ImageIcon("./src/image/man.png");
		JButton imgcon= new JButton(img);
		east.add(imgcon);
		
		JPanel center = new JPanel();
		JButton itemEquip = new JButton("아이템 장착");
		itemEquip.setPreferredSize(new Dimension(120,30));
		itemEquip.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select=table.getSelectedRow();
				int temp=ser.itemEquip(ID,character.getName(),dtosItem.get(select));
				if(temp==0) {
					JOptionPane.showMessageDialog(null, "해당 아이템을 장착하였습니다.", "Message",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "기존 아이템과 교체하였습니다.", "Message",JOptionPane.INFORMATION_MESSAGE);
				}
				
				int temp1= ser.itemDelete(dtosItem.get(select).getItemID());
				
				dtosItem=ser.getAllItem(character.getName());
				for(int i=0;i<dtosItem.size();i++) {
					contents[i][0]=dtosItem.get(i).getType();
					contents[i][1]=String.valueOf(dtosItem.get(i).getAttack());
					contents[i][2]=String.valueOf(dtosItem.get(i).getdefense());
					contents[i][3]=String.valueOf(dtosItem.get(i).getAttack_speed());
					contents[i][4]=String.valueOf(dtosItem.get(i).getHP());	
				}
				for(int i=dtosItem.size();i<20;i++) {
					contents[i][0]="";
					contents[i][1]="";
					contents[i][2]="";
					contents[i][3]="";
					contents[i][4]="";
				}
				
				double hp=0.0;
				double attack1=0.0;
				double defense1=0.0;
				double as=0.0;
				
				dtosInven=ser.update(ID,character.getName());
				if(dtosInven.size()!=0) {
					for(int i=0;i<dtosInven.size();i++) {
						hp+=dtosInven.get(i).getHP();
						attack1+=dtosInven.get(i).getAttack();
						defense1+=dtosInven.get(i).getdefense();
						as+=dtosInven.get(i).getAttack_speed();
					}
					HP.setText("HP:"+String.valueOf(character.getHP()+hp));
					attack.setText("공격력"+String.valueOf(character.getAttack()+attack1));
					defense.setText("방어력"+String.valueOf(character.getdefense()+defense1));
					attack_s.setText("공격속도"+String.valueOf(character.getAttack_speed()-as));
				}
				
				
				
				frame.repaint();
				table.setVisible(true);
		     }
		});
		
		JButton itemDelete = new JButton("아이템 버리기");
		itemDelete.setPreferredSize(new Dimension(120,30));
		itemDelete.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select=table.getSelectedRow();
				
				int temp = ser.itemDelete(dtosItem.get(select).getItemID());
				dtosItem=ser.getAllItem(character.getName());
				for(int i=0;i<dtosItem.size();i++) {
					contents[i][0]=dtosItem.get(i).getType();
					contents[i][1]=String.valueOf(dtosItem.get(i).getAttack());
					contents[i][2]=String.valueOf(dtosItem.get(i).getdefense());
					contents[i][3]=String.valueOf(dtosItem.get(i).getAttack_speed());
					contents[i][4]=String.valueOf(dtosItem.get(i).getHP());	
				}
				for(int i=dtosItem.size();i<20;i++) {
					contents[i][0]="";
					contents[i][1]="";
					contents[i][2]="";
					contents[i][3]="";
					contents[i][4]="";
				}
				frame.repaint();
				table.setVisible(true);
				JOptionPane.showMessageDialog(null, "해당 아이템을 버렸습니다.", "Message",JOptionPane.INFORMATION_MESSAGE);
		     }
		});
		
		center.add(itemEquip);
		center.add(itemDelete);
		
		//frame.add(man);
		frame.add(east,BorderLayout.WEST);
		frame.add(center,BorderLayout.CENTER);
		frame.add(scrollpane,BorderLayout.EAST);
		frame.add(top,BorderLayout.NORTH);
		frame.add(bottom,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0, null);
	}
}
