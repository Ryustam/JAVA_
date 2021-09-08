package practice;

class dog{
	private String name;
	private int age;
	private String gender;
	
	dog(String name, int age, String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d, 성별: %s",this.name,this.age,this.gender);
	}
	
}


public class ex3_3 {

	public static void main(String[] args) {
		
		dog s1 = new dog("멍멍이",9,"수컷");
		s1.showInfo();

	}

}
