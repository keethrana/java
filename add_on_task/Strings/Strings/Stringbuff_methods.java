package Strings;

public class Stringbuff_methods {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str2 = new StringBuffer("Moon");
		
		System.out.println(str.equals(str2));
		System.out.println(str.append(str2));
		
		System.out.println();
	}
}
