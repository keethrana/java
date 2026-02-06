package Inheritance;

public class abstraction {
	abstract class Demo
	{
		abstract void Display();
		public void Greet()
		{
			System.out.println("Welcome");
		}
	}
public abstract class abstraction_ex extends Demo{
	public static void main(String [] args) {
		abstraction_ex a= new abstraction_ex();
		a.Display();
	}
	@override
	void Display() {
		System.out.println("Abstraction example");
	}
	@override
	void interest() {
		System.out.println("canaran bank provide 15% interest");
		
	}
	
}
}
