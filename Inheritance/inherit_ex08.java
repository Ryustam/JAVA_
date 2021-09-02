package Inheritance;


class YourPerson{
	private String name;
	private int age;
	private double height;
	
	public YourPerson() {
		name="기본이름";
		age=20;
		height=176.4;
	}
	
	public YourPerson(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void Introduce() {
		System.out.printf("이름:%s\n", name);
		System.out.printf("나이:%d\n", age);
		System.out.printf("키:%.1f\n", height);
	}
	
}

class YourStudent extends YourPerson{
	private int grade;
	private int score;
	
	public YourStudent() {
		super();
		grade=1;
		score=80;
	}
	
	public YourStudent(String name, int age, double height,
			int grade,int score) {
		super(name,age,height);
		//String, int, double 값을받는 부모 생성자 호출
		this.grade=grade; //나의 멤버변수
		this.score=score; //나의 멤버변수
		
		//부모 멤버변수는 부모생성자로 처리하고
		//원래 나의 멤버변수는 내가 값을준다.
	}
	
	public void Introduce() {
		super.Introduce();
		System.out.printf("학년:%d\n", grade);
		System.out.printf("점수:%d\n", score);
	}
	
	
}

class YourEmployee extends YourPerson{
	private String rank;
	private int salary;
	
	YourEmployee(){
		super();
		this.rank="직원";
		this.salary=2000;
	}
	
	YourEmployee(String name, int age, double height, String rank, int salary){
		super(name,age,height);
		this.rank=rank;
		this.salary=salary;
	}
	public void Introduce() {
		super.Introduce();
		System.out.printf("직급:%s\n", rank);
		System.out.printf("연봉:%d\n", salary);
	}
	
}




public class inherit_ex08 {

	public static void main(String[] args) {
		YourStudent s1 = new YourStudent("김씨",18,176.4,100,100);
		s1.Introduce();
		
		YourEmployee s2= new YourEmployee("박씨",27,176,"대리",2500);
		s2.Introduce();
		

	}

}
