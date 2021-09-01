package student;



class Student {
	
	private String name;
	private int grade;
 	private double Korean;
 	private double English;
 	private double math;
 	private double sum=0;
 	private double avg=0;
 	
	Student(){
		this.name="기본학생";
		this.grade=1;
		this.Korean=0;
		this.English=0;
		this.math=0;
	}
	
	Student(String name,int grade,double Korean, double English, double math) {
		this.name=name;
		this.grade=grade;
		this.Korean=Korean;
		this.English=English;
		this.math=math;
	}
	
	public double calcTotal() {
		this.sum=this.Korean+this.English+this.math;
		return sum;
	}
	public double calcAvergage() {
		this.avg=(this.calcTotal()/3);
		return avg;
	}
	
	public void showInfo() {
		System.out.printf("이름:%s\n", this.name);
		System.out.printf("학년:%d\n", this.grade);
		System.out.printf("국어:%.2f\n", this.Korean);
		System.out.printf("영어:%.2f\n", this.English);
		System.out.printf("수학:%.2f\n", this.math);
		System.out.printf("총점:%.2f\n", this.calcTotal());
		System.out.printf("평균:%.2f\n\n", this.calcAvergage());
	}
	
	
}


public class main {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student("도도",3,90.0,60.0,70.0);
		
		s1.showInfo();
		
		s2.showInfo();
		
		
	}

}
