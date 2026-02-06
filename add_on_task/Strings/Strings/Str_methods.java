package Strings;

public class Str_methods {

	public static void main(String[] args) {
		
		String str = "hello WORLD";
		String str2 = "Java";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals("HELLO WORLD"));
		System.out.println(str.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(str.contains(str2));
		System.out.println(str.concat(str2));
		String s = "This is a Note";
//		String[] s1 = s.split(" ");
//		
//		for(int i=s1.length-1;i>=0;i--)
//			
//			System.out.print(s1[i]+" ");
		
//		String atm = "1234 5678 9123 4567";
//		String sep = "XXXX ".repeat(3) +atm.substring(15);
//		System.out.println(sep);
	}
}
