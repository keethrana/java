package operator;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
//		3. Check if a character is an alphabet or not
//		   Write a program to check whether the given character is an alphabet.*
//		   Sample Input: A
//		   Sample Output: Alphabet

		Scanner sc=new Scanner(System.in);
		char al;
		System.out.println("Sample Input:");
		al=sc.next().charAt(0);
		if(al>='a' && al<='z' || al>='A' && al<='Z')
		{
			System.out.println(" Output: Alphabet");
		}
		else
		{
			System.out.println("Output: invalid");
		}
		sc.close();
	}
	

}
