package Inheritance;

class Fruits{
	void dis1() {
		System.out.println("This is a fruit");
	}
}

class Apple extends Fruits{
	void dis2() {
		System.out.println("This is an Apple");
	}
}

class Mongo extends Fruits{
	void dis3() {
		System.out.println("This is a Mongo");
	}
}
public class Heirarchical {

	public static void main(String[] args) {
		Apple a = new Apple();
		Mongo m = new Mongo();
		
		a.dis1();
		a.dis2();
		
		m.dis1();
		m.dis3();
	}

}
