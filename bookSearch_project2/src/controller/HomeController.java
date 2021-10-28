package controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.*;

import DTO.rentDate;
import DTO.login;
import DTO.memberVO;
import service.memberService;

public class HomeController {
	protected ArrayList<memberVO> dtos;
	protected ArrayList<memberVO> dtosSearch;
	protected ArrayList<memberVO> dtosRent;
	protected ArrayList<memberVO> dtosReturn;
	protected ArrayList<login> dtoslogin;
	protected ArrayList<rentDate> dtosRentDate;
	protected JScrollPane scrollpane;
	protected boolean success=false;
	protected JTable table;
	
	public static void main(String[] args) {
		
		HomeController t1 = new HomeController();
		ArrayList<memberVO> dtos;
		ArrayList<memberVO> dtosSearch;
		ArrayList<memberVO> dtosID;
		ArrayList<memberVO> dtosRent;
		memberService service = new memberService();
		Scanner sc = new Scanner(System.in);
		
		//JFrame 설정
		
				
		Dimension dim = new Dimension(1200,500);
		JButton Allmember,searchBook,rentBook,returnBook;
		
		JFrame frame = new JFrame("도서통합시스템");
		frame.setLocation(500,500);
		frame.setPreferredSize(dim);
		
		
		//로그인 부분
	
		LocalDate todaysDate = LocalDate.now();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String today=format.format(cal.getTime());
		cal.add(Calendar.DAY_OF_MONTH,+7);
		
		boolean success=false;
		
		JPanel p2 = new JPanel();
		JLabel ID =new JLabel("ID : ");
		JLabel PW = new JLabel("PassWord : ");
		JTextField txtID = new JTextField(10);      // 여기서 숫자 10은 칸수를 의미한다.  
		JPasswordField txtPW = new JPasswordField(10);  
		
		
		// 사용자 대출정보
		String userHeader[]= {"책이름","대출일","반납일"};
		String userCountents[][] =new String[service.countBook()][3];
		JTable userTable = new JTable(userCountents,userHeader);
		userTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		userTable.getColumnModel().getColumn(0).setPreferredWidth(150);
		userTable.getColumnModel().getColumn(1).setPreferredWidth(75);
		userTable.getColumnModel().getColumn(2).setPreferredWidth(75);
		JScrollPane userScrollpane = new JScrollPane(userTable);
		userScrollpane.setPreferredSize(new Dimension(320,50));
		
		
		JButton logBtn = new JButton("Log in");
		logBtn.addActionListener( new ActionListener() {
		     public void actionPerformed(ActionEvent e) {

		        t1.dtoslogin=service.login(txtID.getText());
		        String input_ID=txtID.getText();
		        String input_PW=txtPW.getText();
		        
		        if(t1.dtoslogin.size()==0) {
		        	JOptionPane.showMessageDialog(null, "없는 아이디입니다.", "Message",JOptionPane.ERROR_MESSAGE);
		        }
		        
		        for(int i=0;i<t1.dtoslogin.size();i++) {
		        	if(t1.dtoslogin.get(i).getID().equals(input_ID)) {
		        		if(t1.dtoslogin.get(i).getPW().equals(input_PW)) {
		        			JOptionPane.showMessageDialog(null, "로그인 성공!", "Message",JOptionPane.INFORMATION_MESSAGE);
		        			t1.success=true;
		     
		        		}else {
		        			JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "Message",JOptionPane.ERROR_MESSAGE);
		        			
		        		}	
		        	}
		        }
		     }
		});
		
		JButton logOutBtn = new JButton("Log out");
		logOutBtn.addActionListener( new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 txtID.setText(null);
		    	 txtPW.setText(null);
		    	 if(t1.dtosRentDate !=null) {
		    		 for(int i=0;i<t1.dtosRentDate.size();i++) {
		    			userCountents[i][0]=null;
		    			userCountents[i][1]=null;
		    			userCountents[i][2]=null;	
		    		 }
		    	 } else {
		    		 
		    	 }
		    	 frame.repaint();
		    	 userTable.setVisible(false);
		    	 
		    	 t1.success=false;
		     }
		});
		
		JButton showRentBtn = new JButton("대출중인 책");
		showRentBtn.addActionListener( new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 int i=0,j=0;
		    	 t1.dtosRentDate=service.getList(txtID.getText());
		    	 
		    	if(t1.dtosRentDate.size()==0) {
		    		JOptionPane.showMessageDialog(null, "빌린 책이 없습니다.", "Message",JOptionPane.ERROR_MESSAGE);
		    		frame.repaint();
		    		userTable.setVisible(false);
		    	}else {
		    		if(t1.success==true) {
			    		for(j=0;j<t1.dtosRentDate.size();j++) {
			    			userCountents[j][0]=t1.dtosRentDate.get(j).getbookName();
			    			userCountents[j][1]=t1.dtosRentDate.get(j).getRentDay();
			    			userCountents[j][2]=t1.dtosRentDate.get(j).getReturnDay();	
			    		}
			    		for(i=t1.dtosRentDate.size();i<service.countBook();i++) {
			    			userCountents[i][0]="";
			    			userCountents[i][1]="";
			    			userCountents[i][2]="";
							
						}
			    		frame.repaint();
				 		userTable.setVisible(true);	
			    	}
		    	}
		    	
		     }
		});
		
		
		
		//책 부분
		String header[]= {"책이름","저자","출판사","출판일","페이지수","도서관","ID","분류","대출횟수","대출여부"};
		String contents[][] = new String[service.countBook()][10];
		int i;
		
		
		JTable table = new JTable(contents, header);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		JScrollPane scrollpane = new JScrollPane(table);
		JPanel p = new JPanel();
		
		
		
		t1.dtos=service.getAllMembers();
		for(i=0;i<t1.dtos.size();i++) {
			contents[i][0]=t1.dtos.get(i).getBookName();
			contents[i][1]=t1.dtos.get(i).Author();
			contents[i][2]=t1.dtos.get(i).getPublisher();
			contents[i][3]=t1.dtos.get(i).getPublishingYear();
			contents[i][4]=Integer.toString(t1.dtos.get(i).getPage());
			contents[i][5]=t1.dtos.get(i).getLibraryName();
			contents[i][6]=Integer.toString(t1.dtos.get(i).getID());
			contents[i][7]=t1.dtos.get(i).getStorePlace();
			contents[i][8]=Integer.toString(t1.dtos.get(i).getCheckOutNum());
			contents[i][9]=t1.dtos.get(i).getisCheckOut();	
		}
		
		
		Allmember=new JButton("모든 책(갱신)");
		Allmember.setPreferredSize(new Dimension(120, 30));
		Allmember.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.dtos=service.getAllMembers();
				int i;
				for(i=0;i<t1.dtos.size();i++) {
					contents[i][0]=t1.dtos.get(i).getBookName();
					contents[i][1]=t1.dtos.get(i).Author();
					contents[i][2]=t1.dtos.get(i).getPublisher();
					contents[i][3]=t1.dtos.get(i).getPublishingYear();
					contents[i][4]=Integer.toString(t1.dtos.get(i).getPage());
					contents[i][5]=t1.dtos.get(i).getLibraryName();
					contents[i][6]=Integer.toString(t1.dtos.get(i).getID());
					contents[i][7]=t1.dtos.get(i).getStorePlace();
					contents[i][8]=Integer.toString(t1.dtos.get(i).getCheckOutNum());
					contents[i][9]=t1.dtos.get(i).getisCheckOut();						
				}
				frame.repaint();
				table.setVisible(true);
			}
		});
		searchBook = new JButton("책찾기(이름,저자)");
		searchBook.setPreferredSize(new Dimension(150, 30));
		searchBook.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int i;
				String input1 = JOptionPane.showInputDialog("책 제목 or 저자를 입력하세요");
				t1.dtos=service.searchBook(input1);
				for(i=0;i<t1.dtos.size();i++) {
					contents[i][0]=t1.dtos.get(i).getBookName();
					contents[i][1]=t1.dtos.get(i).Author();
					contents[i][2]=t1.dtos.get(i).getPublisher();
					contents[i][3]=t1.dtos.get(i).getPublishingYear();
					contents[i][4]=Integer.toString(t1.dtos.get(i).getPage());
					contents[i][5]=t1.dtos.get(i).getLibraryName();
					contents[i][6]=Integer.toString(t1.dtos.get(i).getID());
					contents[i][7]=t1.dtos.get(i).getStorePlace();
					contents[i][8]=Integer.toString(t1.dtos.get(i).getCheckOutNum());
					contents[i][9]=t1.dtos.get(i).getisCheckOut();						
				}
				
				for(i=t1.dtos.size();i<service.countBook();i++) {
					contents[i][0]="";
					contents[i][1]="";
					contents[i][2]="";
					contents[i][3]="";
					contents[i][4]="";
					contents[i][5]="";
					contents[i][6]="";
					contents[i][7]="";
					contents[i][8]="";
					contents[i][9]="";
				}
				frame.repaint();
				table.setVisible(true);
			}
		});
		rentBook= new JButton("책 대여");
		rentBook.setPreferredSize(new Dimension(80, 30));
		rentBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a=table.getSelectedRow();
				if(t1.dtos.get(a).getisCheckOut().equals("false") && t1.success==true) {
					service.rentBook(t1.dtos.get(a).getID(),t1.dtos.get(a).getCheckOutNum()+1,t1.dtoslogin.get(0).getID(),t1.dtos.get(a).getBookName(),today,format.format(cal.getTime()));
					
					JOptionPane.showMessageDialog(null, "대여 완료", "Message",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "대여 불가능", "Message",JOptionPane.WARNING_MESSAGE);
				}
				frame.repaint();
				table.setVisible(true);
				
				
			}
		});
		
		returnBook = new JButton("책 반납");
		returnBook.setPreferredSize(new Dimension(80, 30));
		returnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a=table.getSelectedRow();
				
				if(t1.dtos.get(a).getisCheckOut().equals("true") && t1.success==true) {
					if(service.checkBook(txtID.getText(),t1.dtos.get(a).getID())) {
					service.returnBook(t1.dtos.get(a).getID());
					JOptionPane.showMessageDialog(null, "반납 완료", "Message",JOptionPane.INFORMATION_MESSAGE);
					}else {
					JOptionPane.showMessageDialog(null, "사용자가 빌린 책이 아닙니다.", "Message",JOptionPane.WARNING_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "반납 불가능", "Message",JOptionPane.WARNING_MESSAGE);
				}
				frame.repaint();
				table.setVisible(true);
				
			}
		});
		
		p2.add(ID);
		p2.add(txtID);
		p2.add(PW);
		p2.add(txtPW);
		p2.add(logBtn);
		p2.add(logOutBtn);
		p2.add(showRentBtn);
		p.add(Allmember);
		p.add(searchBook);
		p.add(rentBook);
		p.add(returnBook);
	
		frame.add(p2,BorderLayout.NORTH);
		frame.add(scrollpane,BorderLayout.CENTER);
		frame.add(userScrollpane,BorderLayout.WEST);
		scrollpane.setVisible(true);
		userTable.setVisible(false);
		userScrollpane.setVisible(true);
		frame.add(p,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
}


