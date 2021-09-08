package practice;

class student{
	private String name;
	private int code;
	private String gender;
	
	student(String name, int code, String gender){
		this.name=name;
		this.code=code;
		this.gender=gender;
	}
	
	public void setCode(int code) {
		this.code=code;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 학번: %d, 성별: %s\n",this.name,this.code,this.gender);
	}
	
}


public class ex2_3 {

	public static void main(String[] args) {
		
		student s1[] = new student[2];
		
		s1[0]=new student("이동준",2009038033,"남");
		s1[1]=new student("이제영",2007012034,"여");
		
		s1[0].setCode(2019038033);
		
		for(int i=0 ;i<s1.length;i++) {
			s1[i].showInfo();
		}
		
	}

}
