package object;

class circle {
	int radius;
	circle(int radius){
		this.radius=radius;
	}
	
	double area() {
		return radius*radius*3.14;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof circle)) {
			return false;
		}
		
		circle circle = (circle) obj;
		if(this.radius == circle.radius) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

public class ex01 {

	public static void main(String[] args) {
		
		circle c1 = new circle(5);
		circle c2 = new circle(5);
		
		if(c1.equals(c2)==true) {
			System.out.println("c1과 c2은 같습니다.");
		}else {
			System.out.println("c1과 c2은 다릅니다.");
		}
	}

}
