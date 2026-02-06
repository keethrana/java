package Inheritance;
class Demo{
	
	int rollno=24;
	public void display() {
		System.out.println("Single Inheritance");
	}
}
class Demo1 extends Demo{
	
	public void dis() {
		System.out.println(rollno);
	}
}

public class SingleInheri {

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.display();
		d.dis();
	}
}
