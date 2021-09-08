package practice;

import java.util.Scanner;

class Circle{
	double rad = 0;
	final double PI= 3.14;
	
	public Circle(double r) {
		setRad(r);
	}
	
	public double getArea() {
		return (rad*rad)*PI;
	}
	
	public void setRad(double r) {
		this.rad = (r>0)?r:r*-1;
	}
	
}


public class ex2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		
		System.out.println("반지름 값을 입력하시오");
		r=sc.nextDouble();
		
		Circle s1 = new Circle(r);
		System.out.println(s1.getArea());
		sc.close();
		
	}

}
