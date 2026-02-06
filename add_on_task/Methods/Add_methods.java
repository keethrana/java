package Methods;

public class Add_methods {

	static int add(int a, int b) {
		return(a+b);
	}
	static int sub(int a, int b) {
		return(a-b);
	}
	static int mul(int a, int b) {
		return(a*b);
	}
	static int div(int a, int b) {
		return(a/b);
	}
	static int mod(int a, int b) {
		return(a%b);
	}

	public static void main(String[] args) {
		System.out.println("Addition is: ,"+add(2,3));
		System.out.println("Subtract is: "+sub(4,3));
		System.out.println("Multiplication is: "+mul(4,5));
		System.out.println("Division is: "+div(10,5));
		System.out.println("Modulus is: "+mod(10,5));
	}

}
