package service;

import java.util.ArrayList;

import DAO.memberDAO;
import DTO.memberVO;

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
	
	public void rentBook(int ID, int num) {
		
		DAO.rentBook(ID,num);
	}
	
	public void returnBook(int ID) {
		DAO.returnBook(ID);
		
	}

	public int countBook() {
		return DAO.countBook();
	}
}
