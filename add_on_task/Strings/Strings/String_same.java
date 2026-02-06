package Strings;

public class String_same {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Helo");
		StringBuffer str5 = new StringBuffer("Hello");
		System.out.println(str==str2);
		System.out.println(str3.equals(str2));
		System.out.println(str==str2);
		

	}

}
