package person_arrayList;

public class Students extends person {
	private int number;
	private int grade;
	private String major;
	private double score;
	
	Students(){}
	
	Students(String name, int age, double height,int number, int grade, String major, double score){
		super(name,age,height);
		this.number=number;
		this.grade=grade;
		this.major=major;
		this.score=score;
	}
	
	public int getNumber() {
		return number;
	}
	public void setScore(double score) {
		this.score=score;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf("학번:%d\n",this.number);
		System.out.printf("학년:%d\n",this.grade);
		System.out.printf("전공:%s\n",this.major);
		System.out.printf("점수:%f\n",this.score);
	}
}
