package arrayList;

import java.util.ArrayList;

class person1{
	private String name;
	private int age;
	private double height;
	
	public person() {
		
	}
	
	public person1(String name, int age, double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	public void showInfo() {
		System.out.printf("이름:%s\n",this.name);
		System.out.printf("나이:%d\n",this.age);
		System.out.printf("키:%f\n",this.height);
		System.out.printf("---------\n");
	}
}

public class ex04 {

	public static void main(String[] args) {
		
		person p1 = new person("이민호",20,176.7);
		person p2 = new person("송중기",21,178.9);
		person p3 = new person("정채연",22,163.4);
		
		ArrayList<person> personList = new ArrayList<person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		for(var i=0; i<personList.size();i++) {
			personList.get(i).showInfo();
		}
		
	}

}
