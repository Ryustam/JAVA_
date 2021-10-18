import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DB_smartphone db = new DB_smartphone();
		//객체 생성하면 생성자 내부에서 연결
		int choice=0;
		String name;
		String company;
		int price;
		String provider;
		int weight;
		String color;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			menuClass_smartphone.menu();
			choice= sc.nextInt();
			if(choice ==1) {
				db.Search();
			}else if (choice==2) {
				System.out.print("이름 입력:");
				name=sc.next();
				db.SearchByName(name);
			}else if (choice==3) {
				//데이터 삽입(추가)
				System.out.print("제품이름 입력:");
				name=sc.next();
				System.out.print("제조사 입력:");
				company=sc.next();
				System.out.print("가격 입력:");
				price=sc.nextInt();
				System.out.print("통신사 입력:");
				provider=sc.next();
				System.out.print("무게 입력:");
				weight=sc.nextInt();
				System.out.print("색상 입력:");
				color=sc.next();
				db.insertPhone(name,company,price,provider,weight,color);	
			}else if (choice==4) {
				System.out.print("이름 입력:");
				name=sc.next();
				System.out.print("변경할 가격 입력:");
				price=sc.nextInt();
				db.updatePhone(name,price);
			}else if (choice==5) {
				System.out.print("이름 입력:");
				name=sc.next();
				db.deletePhone(name);	
			}
		}
	}

}
