package person_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_person {

	public static void main(String[] args) {
		
		ArrayList<person> personList = new ArrayList<person>();
		start(personList);
		
	}
	public static void start(ArrayList<person> personList) {
		Scanner sc = new Scanner(System.in);
		int select;
		boolean code = true;
		
		while(code) {
			userOutput();
			select=sc.nextInt();
			
			switch(select) {
				case 1:
					personAdd(personList);
					break;
				case 2:
					personShowInfo(personList);
					break;
				case 3:
					personSearch(personList);
					break;
				case 4:
					personModify(personList);
					break;
				case 5:
					personDelete(personList);
					break;
				case 6:
					code=false;
					System.out.println("시스템 종료");
					break;	
			}
			
		}
	}
	private static void personDelete(ArrayList<person> personList) {
		Scanner sc = new Scanner(System.in);
		String name;
		boolean info = false;
		System.out.println("학생 이름을 입력하시오");
		name=sc.next();
		
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getName().equals(name)==true) {
				personList.remove(i);
				info =true;
				System.out.println("삭제 성공!");
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
		
	}
	private static void personModify(ArrayList<person> personList) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		boolean info = false;
		System.out.println("학생 이름을 입력하시오");
		name=sc.next();
		
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getName().equals(name)==true) {
				System.out.println("나이를 다시 입력하세요");
				age=sc.nextInt();
				personList.get(i).setAge(age);
				info =true;
				System.out.println("수정 성공!");
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
	}
	public static void personSearch(ArrayList<person> personList) {
		Scanner sc = new Scanner(System.in);
		String name;
		boolean info = false;
		System.out.println("학생 이름을 입력하시오");
		name=sc.next();
		
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getName().equals(name)==true) {
				personList.get(i).showInfo();
				info =true;
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
		
	}
	public static void personShowInfo(ArrayList<person> personList) {
		if(personList.size()==0) {
			System.out.println("데이터가 없습니다.");
		}else {
			for(int i=0;i<personList.size();i++) {
				personList.get(i).showInfo();
			}
		}
		
	}
	public static void personAdd(ArrayList<person> personList) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		
		
		System.out.println("이름?");
		name=sc.next();
		System.out.println("나이?");
		age=sc.nextInt();
		System.out.println("키?");
		height=sc.nextDouble();
			
		person s1 = new person(name,age,height);
		personList.add(s1);
	}
	public static void userOutput() {
		System.out.println("1.사용자 추가");
		System.out.println("2.사용자 모두 조회");
		System.out.println("3.사용자 조건 조회(이름)");
		System.out.println("4.사용자 수정(나이 또는 키)");
		System.out.println("5.사용자 삭제(이름으로 찾아서 삭제)");
		System.out.println();
	}
	
}
