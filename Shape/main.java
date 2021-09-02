package Shape;

class Shape {
	private int weight;
	private int height;
	
	Shape() {
		this.weight=1;
		this.height=1;
	}
	
	Shape(int weight,int height){
		this.weight=weight;
		this.height=height;
	}
	
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	
	public void getArea() {

	}
	
	
}

class Triangle extends Shape{
	private int weight;
	private int height;
	
	Triangle(){
		super();
	}
	
	Triangle(int weight, int height){
		super(weight,height);
	}
	
	public void getArea() {
		System.out.println(super.getHeight()*super.getWeight()/2);
	}
}

class Recangle extends Shape{
	private int weight;
	private int height;
	
	Recangle(){
		super();
	}
	
	Recangle(int weight, int height){
		super(weight,height);
	}
	
	public void getArea() {
		System.out.println(super.getHeight()*super.getWeight());
	}
}



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle s1 = new Triangle(3,4);
		s1.getArea();
		
		Recangle s2 = new Recangle(5,4);
		s2.getArea();
	}

}
