import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_smartphone {
	private Connection con;
	//Connection은 연결 관련
	private Statement st;
	//Statement는 SQL실행 관련
	
	private PreparedStatement pstmt;
	//insert, delete 등 
	//물음표가 들어간 미완성형 쿼리를 실행할때 쓰는게
	//물음표에 나중에 값 집어넣고 실행
	private ResultSet rs;
	//쿼리 실행하고 난 결과가 담기는 곳
	//데이터베이스 결과 집합을 표현하는
	//표형태의 데이터
	
	public DB_smartphone() {
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
		public void Search() {
			String SQL="SELECT * FROM smartphone";
			try {
				rs=st.executeQuery(SQL);
				//statement가 executeQuery매서드로
				//SQL쿼리를 실행한 결과가 ResultSet rs에 담긴다.
				while(rs.next()) {
					String name =rs.getString("NAME");
					String company =rs.getString("COMPANY");
					int price =rs.getInt("PRICE");
					String provider=rs.getString("PROVIDER");
					int weight=rs.getInt("WEIGHT");
					String color =rs.getString("COLOR");
					
					System.out.printf("제품이름: %s ", name);
					System.out.printf("제조사: %s ", company);
					System.out.printf("가격: %d ", price);
					System.out.printf("통신사: %s", provider);
					System.out.printf("무게: %d", weight);
					System.out.printf("색상: %s\n", color);	
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void SearchByName(String input_name) {
			String SQL="SELECT * FROM smartphone WHERE NAME=?";
			//select * from person where NAME='박근혜';
			try {
				//contains로 할 수도 있음 name.contains(input_name)==true
				//select * from smartphone where name like ?
				// "%"+input_name+"%";
				pstmt=con.prepareStatement(SQL);
				pstmt.setString(1, input_name);
				//pstmt.executeUpdate();
				rs = pstmt.executeQuery();
				
			while(rs.next()) {
				String name =rs.getString("NAME");
				String company =rs.getString("COMPANY");
				int price =rs.getInt("PRICE");
				String provider=rs.getString("PROVIDER");
				int weight=rs.getInt("WEIGHT");
				String color =rs.getString("COLOR");
				
				System.out.printf("제품이름: %s ", name);
				System.out.printf("제조사: %s ", company);
				System.out.printf("가격: %d ", price);
				System.out.printf("통신사: %s", provider);
				System.out.printf("무게: %d", weight);
				System.out.printf("색상: %s\n", color);
			}
			rs.close();                                 
			pstmt.close();
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		public void insertPhone(String name, String company, int price, String provider, int weight, String color) {
			String SQL="insert into smartphone(NAME,COMPANY,PRICE,PROVIDER,WEIGHT,COLOR) values (?,?,?,?,?,?)";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setString(1, name); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.setString(2, company);
				pstmt.setInt(3, price);
				pstmt.setString(4, provider);
				pstmt.setInt(5, weight);
				pstmt.setString(6, color);
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		public void updatePhone(String name, int price) {
			String SQL="update smartphone set price=? where name=?";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setInt(1, price); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.setString(2, name);
				
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
			
		}
		
		public void deletePhone(String name) {
			String SQL="delete from smartphone where name=?";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setString(1, name); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
			
		}
			
}
