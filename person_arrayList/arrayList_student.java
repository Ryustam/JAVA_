package person_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_student {

	public static void main(String[] args) {
		
		ArrayList<Students> studentList = new ArrayList<Students>();
		
		start(studentList);
	}

	public static void start(ArrayList<Students> studentList) {
		Scanner sc = new Scanner(System.in);
		int select;
		boolean code = true;
		
		while(code) {
			userOutput();
			select=sc.nextInt();
			
			switch(select) {
				case 1:
					studentAdd(studentList);
					break;
				case 2:
					studentInfo(studentList);
					break;
				case 3:
					studentSearch(studentList);
					break;
				case 4:
					studentModify(studentList);
					break;
				case 5:
					studentDelete(studentList);
					break;
				case 6:
					code=false;
					System.out.println("시스템 종료");
					break;	
			}
			
		}
	}

	private static void studentDelete(ArrayList<Students> studentList) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean info = false;
		System.out.println("학번을 입력하시오");
		number=sc.nextInt();
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getNumber()==number) {
				studentList.remove(i);
				info =true;
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
		
	}

	private static void studentModify(ArrayList<Students> studentList) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean info = false;
		System.out.println("학번을 입력하시오");
		number=sc.nextInt();
		
		double score;
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getNumber()==number) {
				System.out.println("학생을 찾았습니다.");
				System.out.println("새로운 학점을 입력하세요");
				score=sc.nextDouble();
				studentList.get(i).setScore(score);
				info =true;
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
		
	}

	private static void studentSearch(ArrayList<Students> studentList) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean info = false;
		System.out.println("학번을 입력하시오");
		number=sc.nextInt();
		
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getNumber()==number) {
				studentList.get(i).showInfo();
				info =true;
			}
		}
		if(info == false) {
			System.out.println("없는 학생입니다.");
		}
	}

	private static void studentInfo(ArrayList<Students> studentList) {
		if(studentList.size()==0) {
			System.out.println("데이터가 없습니다.");
		}else {
			for(int i=0;i<studentList.size();i++) {
				studentList.get(i).showInfo();
			}
		}
	}

	private static void studentAdd(ArrayList<Students> studentList) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		int number;
		int grade;
		String major;
		double score;
		
		
		System.out.println("이름?");
		name=sc.next();
		System.out.println("나이?");
		age=sc.nextInt();
		System.out.println("키?");
		height=sc.nextDouble();
		System.out.println("학번?");
		number=sc.nextInt();
		System.out.println("학년?");
		grade=sc.nextInt();
		System.out.println("전공?");
		major=sc.next();
		System.out.println("평점?");
		score=sc.nextDouble();
			
		Students s1 = new Students(name,age,height,number,grade,major,score);
		studentList.add(s1);
		
	}

	private static void userOutput() {
		System.out.println("1.학생 추가");
		System.out.println("2.학생 모두 조회");
		System.out.println("3.사용자 조건 조회(학번)");
		System.out.println("4.사용자 수정(학년 또는 평점)");
		System.out.println("5.사용자 삭제(학번으로 찾아서 삭제)");
		System.out.println();
	}

}
