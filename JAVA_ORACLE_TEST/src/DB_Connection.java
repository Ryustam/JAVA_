import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {
	
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
	
	public DB_Connection() {
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
			String SQL="SELECT * FROM person";
			try {
				rs=st.executeQuery(SQL);
				//statement가 executeQuery매서드로
				//SQL쿼리를 실행한 결과가 ResultSet rs에 담긴다.
				while(rs.next()) {
					int no = rs.getInt("no");
					String name = rs.getString("NAME");
					int age = rs.getInt("AGE");
					double height=rs.getDouble("HEIGHT");
					System.out.printf("번호: %d ", no);
					System.out.printf("이름: %s ", name);
					System.out.printf("나이: %d ", age);
					System.out.printf("키: %f\n", height);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void SearchByName(String input_name) {
			String SQL="SELECT * FROM person WHERE NAME="+"'"+input_name+"'";
			//select * from person where NAME='박근혜';
			try {
				rs=st.executeQuery(SQL);
				//statement가 executeQuery매서드로
				//SQL쿼리를 실행한 결과가 ResultSet rs에 담긴다.
				while(rs.next()) {
					int no = rs.getInt("no");
					String name = rs.getString("NAME");
					int age = rs.getInt("AGE");
					double height=rs.getDouble("HEIGHT");
					System.out.printf("번호: %d ", no);
					System.out.printf("이름: %s ", name);
					System.out.printf("나이: %d ", age);
					System.out.printf("키: %f\n", height);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		public void insertPerson(int number,String name, int age, double height) {
			String SQL="insert into person(NO,NAME,AGE,HEIGHT) values (?,?,?,?)";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setInt(1, number); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setDouble(4, height);
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		public void updatePerson(String name, int age) {
			String SQL="update person set age=? where name=?";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setInt(1, age); // 1번 물음표에 정수 no를 넣겠다.
				pstmt.setString(2, name);
				
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
			
		}
		
		public void deletePerson(String name) {
			String SQL="delete from person where name=?";
			
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setString(1, name); // 1번 물음표에 정수 no를 넣겠다.

				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
			
		}
		
}
