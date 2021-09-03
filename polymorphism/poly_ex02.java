package polymorphism;

class Animal{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}


class ZooKeeper{
	void feed(Animal animal) {
		System.out.printf("%s에게고기주기\n",animal);
	}
}


public class poly_ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal lion1 = new Lion();
		ZooKeeper james = new ZooKeeper();
		james.feed(lion1);
		
		Animal rabbit1 = new Rabbit();
		james.feed(rabbit1);
		
		Animal monkey1 = new Monkey();
		james.feed(monkey1);
		
	}

}
