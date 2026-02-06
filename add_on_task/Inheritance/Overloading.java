package Inheritance;
class Sample{
	public void exit() {
		System.out.println("Exit through Window");
	}
	
	public void exit(int a ) {
		System.out.println("Exit through LIFT");
	}
	
	public void exit(String name) {
		System.out.println("Exit through Main Gate");
	}
}

public class Overloading {

	public static void main(String[] args) {
		Sample s = new Sample();
		
		s.exit();
		s.exit(67);
		s.exit(" ");
	}

}
