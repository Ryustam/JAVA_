package info_student;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private double height;
	
	public Person(){
		this.name="";
		this.age=0;
		this.height=0;
	}
	
	public void nameSet(String name) {
		this.name=name;
	}
	public void ageSet(int age) {
		this.age=age;
	}
	public void heightSet(double height) {
		this.height=height;
	}
	
	public String nameGet() {
		return this.name;
	}
	public int ageGet() {
		return this.age;
	}
	public double heightGet() {
		return this.height;
	}
	
	public Person(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("키: %f\n", height);
	}
	
	
}

class Student extends Person{
	private int code;
	private int grade;
	private String major;
	private int score;
	
	Scanner sc = new Scanner(System.in);
	
	public Student() {
		super();
		this.code=0;
		this.grade=0;
		this.major="";
		this.score=0;
	}
	
	public Student(String name, int age, double height, int code,
			int grade,String major, int score) {
		super(name,age,height);
		this.code=code;
		this.grade=grade;
		this.major=major;
		this.score=score;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("학번: %d\n", code);
		System.out.printf("학년: %d\n", grade);
		System.out.printf("전공: %s\n", major);
		System.out.printf("학점: %d\n\n", score);
	}
	
	public void grauate(Student human) {
		if(human.grade>=4 && human.score>=150) {
			System.out.printf(human.nameGet());
			System.out.println("졸업가능");
		}
	}
	/*
	public void start(Student arr2[]){


		int choice;
		boolean offset=true;
		
		while(offset) {
			System.out.println("메뉴선택");
			System.out.println("1.학생정보조회 2.졸업조건 충족 학생 조회");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					for(int i=0;i<arr2.length;i++) {
						arr2[i].showInfo();
					}						
					break;
				case 2:
					for(int i=0;i<arr2.length;i++) {
						this.grauate(arr2[i]);
					}
					break;
				default :
					offset=false;
					System.out.println("시스템 종료");
					break;
			}
		}
		
		
	}
	*/
}



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student humans[] = new Student[3];
		
		humans[0]=new Student("도도",20,175.5,810,2,"고분자",60);
		humans[1]=new Student("뭉도",21,165.5,513,4,"컴퓨터",160);
		humans[2]=new Student("도뭉",22,185.5,810,4,"고양이",150);
		
		start(humans);
		
		
	}

	public static void start(Student arr2[]) {
		int choice;
		boolean offset=true;
		Scanner sc = new Scanner(System.in);
		
		while(offset) {
			System.out.println("메뉴선택");
			System.out.println("1.학생정보조회 2.졸업조건 충족 학생 조회");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
					for(int i=0;i<arr2.length;i++) {
						arr2[i].showInfo();
					}						
					break;
				case 2:
					for(int i=0;i<arr2.length;i++) {
						arr2[i].grauate(arr2[i]);
					}
					break;
				default :
					offset=false;
					System.out.println("시스템 종료");
					break;
			}
		}
		
	}

}
