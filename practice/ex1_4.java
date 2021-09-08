package practice;

class cat{
	private String name;
	private int age;
	private String gender;
	
	cat(String name, int age, String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s\n",this.name);
		System.out.printf("나이: %d\n",this.age);
		System.out.printf("성별: %s\n",this.gender);
	}
	
	
}


public class ex1_4 {

	public static void main(String[] args) {
		
	cat s1 = new cat("도도",5,"수컷");	
	cat s2 = new cat("도도",6,"암컷");	
	
	s1.showInfo();
	s2.showInfo();
	
		
	}

}
