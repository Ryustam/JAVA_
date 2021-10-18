package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import dto.memberVO;

public class memberDAO {
	private ArrayList<memberVO> dtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public memberDAO() {
		dtos = new ArrayList<memberVO>();
		
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
				String ID = rs.getString("StorePlace");
				int CheckOutNum = rs.getInt("CheckOutNum");
				String isCheckOut = rs.getString("isCheckOut");
				boolean con_bool=(isCheckOut=="false")? false:true;
				
				memberVO VO=new memberVO(String BookName,
						 String Author,
						 String Publisher,
						 String PublishingYear,
						 int Page,
						 String LibraryName,
						 String ID,
						 String StorePlace,
						 int CheckOutNum,
						 boolean con_bool);
				dtos.add(VO);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
}