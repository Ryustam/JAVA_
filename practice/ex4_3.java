package practice;

class student1{
	private String name;
	private int code;
	private String gender;
	
	student1(String name, int code, String gender){
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


public class ex4_3 {

	public static void main(String[] args) {
		
		student1 s1 = new student1("이동준",2009038033,"남");
		s1.showInfo();
		
	}

}
