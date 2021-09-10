package person_arrayList;

class person {
	private String name;
	private int age;
	private double height;
	
	person(){}
	
	public person(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public void showInfo() {
		System.out.printf("이름:%s\n", this.name);
		System.out.printf("나이:%d\n", this.age);
		System.out.printf("키:%.1f\n", this.height);
	}
}
