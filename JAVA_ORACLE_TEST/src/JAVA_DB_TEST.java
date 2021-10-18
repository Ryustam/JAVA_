import java.util.Scanner;

public class JAVA_DB_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB_Connection db = new DB_Connection();
		//객체 생성하면 생성자 내부에서 연결
		int choice=0;
		String name;
		int age;
		int number;
		double height;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			MenuClass.menu();
			choice= sc.nextInt();
			if(choice ==1) {
				db.Search();
			}else if (choice==2) {
				System.out.print("이름 입력:");
				name=sc.next();
				db.SearchByName(name);
			}else if (choice==3) {
				//데이터 삽입(추가)
				System.out.print("번호 입력:");
				number=sc.nextInt();
				System.out.print("이름 입력:");
				name=sc.next();
				System.out.print("나이 입력:");
				age=sc.nextInt();
				System.out.print("키 입력:");
				height=sc.nextDouble();
				db.insertPerson(number,name,age,height);	
			}else if (choice==4) {
				System.out.print("이름 입력:");
				name=sc.next();
				System.out.print("나이 입력:");
				age=sc.nextInt();
				db.updatePerson(name,age);
			}else if (choice==5) {
				System.out.print("이름 입력:");
				name=sc.next();
				db.deletePerson(name);	
			}
		}
	}

}
