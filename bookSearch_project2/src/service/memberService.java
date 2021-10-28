package service;

import java.util.ArrayList;
import java.util.Calendar;

import DAO.memberDAO;
import DTO.memberVO;
import DTO.login;
import DTO.rentDate;

public class memberService {
	private memberDAO DAO;
	
	public memberService() {
		DAO=new memberDAO();
	}
	
	public ArrayList<memberVO> getAllMembers() {
		return DAO.getAllMembers();
	}
	public ArrayList<memberVO> searchBook(String input) {
		return DAO.searchBook(input);
	}
	
	public void addBook(String BookName,
			 String Author,
			 String Publisher,
			 String PublishingYear,
			 int Page,
			 String LibraryName,
			 int ID,
			 String StorePlace,
			 int CheckOutNum,
			 String isCheckOut) {
		DAO.addBook(BookName,Author,Publisher,PublishingYear,Page,LibraryName,ID,
				 StorePlace,CheckOutNum,isCheckOut);
	}
	
	public void deleteBook(int ID) {
		
		DAO.deleteBook(ID);
	}

	public ArrayList<memberVO> searchID(String BookName) {
		
		return DAO.searchID(BookName);
	}
	
	public ArrayList<memberVO> rentBookSearch(String BookName) {
		
		return DAO.rentBookSearch(BookName);
	}
	public ArrayList<memberVO> returnBookSearch(String BookName) {
		
		return DAO.returnBookSearch(BookName);
	}
	
	public void rentBook(int ID, int num, String name,String bookName ,String rentday, String returnday) {
		DAO.rentBook(ID,num);
		DAO.saveDate(name,bookName,ID, rentday, returnday);
	}
	
	public void returnBook(int ID) {
	
		DAO.returnBook(ID);	
		DAO.delete_saveDate(ID);
		
	}

	public int countBook() {
		return DAO.countBook();
	}
	
	public int countUserBook() {
		return DAO.countUserBook();
	}
	
	public ArrayList<login> login(String ID){
		return DAO.login(ID);
	}
	
	public ArrayList<rentDate> getList(String name) {
		return DAO.getList(name);
	}
	
	public boolean checkBook(String name,int ID) {
		boolean check=false;
		check = DAO.checkBook(name, ID) == 1 ? (check=true):(check=false);
		return check;
	}
}
