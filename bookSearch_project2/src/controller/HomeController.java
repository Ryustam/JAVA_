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

import DTO.memberVO;
import service.memberService;

public class HomeController {
	protected ArrayList<memberVO> dtos;
	protected ArrayList<memberVO> dtosSearch;
	protected ArrayList<memberVO> dtosRent;
	protected ArrayList<memberVO> dtosReturn;
	protected JCheckBox checkBox1;
	
	public static void main(String[] args) {
		
		HomeController t1 = new HomeController();
		ArrayList<memberVO> dtos;
		ArrayList<memberVO> dtosSearch;
		ArrayList<memberVO> dtosID;
		ArrayList<memberVO> dtosRent;
		memberService service = new memberService();
		Scanner sc = new Scanner(System.in);
		LocalDate todaysDate = LocalDate.now();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		
				
		Dimension dim = new Dimension(1000,500);
		JButton Allmember,searchBook,rentBook,returnBook;
		
		JFrame frame = new JFrame("도서통합시스템");
		frame.setLocation(500,500);
		frame.setPreferredSize(dim);
		
		String header[]= {"책이름","저자","출판사","출판일","페이지수","도서관","ID","분류","대출횟수","대출여부"};
		String contents[][] = new String[service.countBook()][10];
		int i;
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
		
		JTable table = new JTable(contents, header);
		JScrollPane scrollpane = new JScrollPane(table);
		JPanel p = new JPanel();
		Allmember=new JButton("모든 책");
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
		searchBook = new JButton("책찾기(이름,저자");
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
		rentBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a=table.getSelectedRow();
				if(t1.dtos.get(a).getisCheckOut().equals("false")) {
					service.rentBook(t1.dtos.get(a).getID(),t1.dtos.get(a).getCheckOutNum()+1);
					JOptionPane.showMessageDialog(null, "대여 완료", "Message",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "대여 불가능", "Message",JOptionPane.WARNING_MESSAGE);
				}
				frame.revalidate();
				table.setVisible(true);
				/*
				String input1 = JOptionPane.showInputDialog("책제목를 입력하세요");
				if(input1.equals(null)==false) {
					t1.dtosRent=service.rentBookSearch(input1);
					//rentConfirm(t1.dtosRent)
					//t1.checkBox1=new JCheckBox("");
					int result =JOptionPane.showConfirmDialog(null,rentConfirm(t1.dtosRent), "책 대출", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.CLOSED_OPTION)	{
					
					}
					else if(result == JOptionPane.YES_OPTION) {
						int i;
						for(i=0;i<t1.dtosRent.size();i++) {
							if(t1.dtosRent.get(i).getisCheckOut()=="가능") {
								service.rentBook(t1.dtosRent.get(i).getBookName(),t1.dtosRent.get(i).getCheckOutNum()+1);
							}
						}
					}else {
						
					}
				}
				*/
				
			}
		});
		
		returnBook = new JButton("책 반납");
		returnBook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a=table.getSelectedRow();
				
				if(t1.dtos.get(a).getisCheckOut().equals("true")) {
					service.returnBook(t1.dtos.get(a).getID());
					
					JOptionPane.showMessageDialog(null, "반납 완료", "Message",JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "반납 불가능", "Message",JOptionPane.WARNING_MESSAGE);
				}
				
				frame.revalidate();
				table.setVisible(true);
				/*
				String input1 = JOptionPane.showInputDialog("책제목를 입력하세요");
				
				t1.dtosReturn=service.rentBookSearch(input1);
				
				int result =JOptionPane.showConfirmDialog(null,returnConfirm(t1.dtosReturn), "책 반납", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION)	{
					
				}
				else if(result == JOptionPane.YES_OPTION) {
					int i;
					for(i=0;i<t1.dtosReturn.size();i++) {
						if(t1.dtosReturn.get(i).getisCheckOut()=="불가능") {
							service.returnBook(t1.dtosReturn.get(i).getBookName());
						}
					}
				}else {
					
				}
				
				*/
				
			}
		});
		p.add(Allmember);
		p.add(searchBook);
		p.add(rentBook);
		p.add(returnBook);
		frame.add(scrollpane,BorderLayout.NORTH);
		frame.add(p,BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static String rentConfirm(ArrayList<memberVO> dtosRent) {
		int i;
		String BookName = null;
		String rentable = null;
		for(i=0;i<dtosRent.size();i++) {
			BookName=dtosRent.get(i).getBookName();
			rentable=dtosRent.get(i).getisCheckOut();
		}
		String a= "책이름:"+BookName+"\n"+"대출가능:"+rentable;
		return a;
	}
	public static String returnConfirm(ArrayList<memberVO> dtosReturn) {
		int i;
		String BookName = null;
		String a=null;
		for(i=0;i<dtosReturn.size();i++) {
			if(dtosReturn.get(i).getisCheckOut().equals("불가능"))
			BookName=dtosReturn.get(i).getBookName();
			a="책이름:"+BookName+"\n";
		}
		
		return a;
	}
}


