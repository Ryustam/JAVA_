package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import DTO.memberVO;

public class memberDAO {
	private ArrayList<memberVO> dtos;
	private ArrayList<memberVO> dtosSearch;
	private ArrayList<memberVO> dtosID;
	private ArrayList<memberVO> dtosRent;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
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
	public ArrayList<memberVO> getAllMembers() {
		dtos = new ArrayList<memberVO>();
		String SQL="SELECT * FROM Book";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {	
				String BookName = rs.getString("BookName");
				String Author = rs.getString("Author");
				String Publisher = rs.getString("Publisher");
				String PublishingYear = rs.getString("PublishingYear");
				int Page = rs.getInt("Page");
				String LibraryName = rs.getString("LibraryName");
				int ID = rs.getInt("ID");
				String StorePlace = rs.getString("StorePlace");
				int CheckOutNum = rs.getInt("CheckOutNum");
				String isCheckOut = rs.getString("isCheckOut");
				memberVO VO=new memberVO(BookName,Author,Publisher,PublishingYear,Page,LibraryName,ID,
						 StorePlace,CheckOutNum,isCheckOut);
				dtos.add(VO);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	public ArrayList<memberVO> searchBook(String input) {
		dtosSearch = new ArrayList<memberVO>();
		String SQL="SELECT * FROM Book where BookName Like ? or Author Like ?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1,"%"+input+"%");
			pstmt.setString(2,"%"+input+"%");
			//pstmt.setString(2,"%"+input+"%");
			//pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				String BookName = rs.getString("BookName");
				String Author = rs.getString("Author");
				String Publisher = rs.getString("Publisher");
				String PublishingYear = rs.getString("PublishingYear");
				int Page = rs.getInt("Page");
				String LibraryName = rs.getString("LibraryName");
				int ID = rs.getInt("ID");
				String StorePlace = rs.getString("StorePlace");
				int CheckOutNum = rs.getInt("CheckOutNum");
				String isCheckOut = rs.getString("isCheckOut");
				
				memberVO VO=new memberVO(BookName,Author,Publisher,PublishingYear,Page,LibraryName,ID,
						 StorePlace,CheckOutNum,isCheckOut);
				dtosSearch.add(VO);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtosSearch;
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
			 String isCheckOut) 
		{
		
			String SQL="insert into Book values (?,?,?,?,?,?,?,?,?,?)";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setString(1, BookName); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.setString(2, Author);
				pstmt.setString(3, Publisher);
				pstmt.setString(4, PublishingYear);
				pstmt.setInt(5, Page);
				pstmt.setString(6, LibraryName);
				pstmt.setInt(7, ID);
				pstmt.setString(8, StorePlace);
				pstmt.setInt(9, CheckOutNum);
				pstmt.setString(10, isCheckOut);
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
	public void deleteBook(int ID) {
		
		String SQL="delete from Book where ID=?";
		
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1, ID); // 1번 물음표에 정수 no를 넣겠다.
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
	}
	public ArrayList<memberVO> searchID(String bookName) {
		dtosID = new ArrayList<memberVO>();
		String SQL="select BookName,ID from Book where BookName like ?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1, "%"+bookName+"%"); // 1번 물음표에 정수 no를 넣겠다.
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				String BookName = rs.getString("BookName");
				int ID = rs.getInt("ID");
				memberVO VO=new memberVO(BookName,ID);
				dtosID.add(VO);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return dtosID;
	}
	public ArrayList<memberVO> rentBookSearch(String bookName) {
		dtosRent = new ArrayList<memberVO>();
		String SQL="select BookName,CheckOutNum,isCheckOut from Book where BookName like ?";
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setString(1, "%"+bookName+"%"); // 1번 물음표에 정수 no를 넣겠다.
			rs = pstmt.executeQuery();
			while(rs.next()) {	
				String BookName = rs.getString("BookName");
				int CheckOutNum = rs.getInt("CheckOutNum");
				String isCheckOut = rs.getString("isCheckOut");
				String rentPossible=(isCheckOut.contains("false"))?"가능":"불가능";
				memberVO VO=new memberVO(BookName,CheckOutNum,rentPossible);
				dtosRent.add(VO);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return dtosRent;
	}
	
	public  void rentBook(String bookName, int num) {
		
		String SQL="update Book set CheckOutNum=?,isCheckOut='true' where BookName LIKE ?";
		
		try {
			pstmt=con.prepareStatement(SQL);
			pstmt.setInt(1,num);
			pstmt.setString(2,"%"+bookName+"%");
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
	}
}
