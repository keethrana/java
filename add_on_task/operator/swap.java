package operator;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
//		5. Swap two numbers without using a temporary variable
//		   Write a program to swap two integers without using a temporary variable.*
//		   Sample Input: a = 5, b = 10
//		   Sample Output: a = 10, b = 5
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a value:");
       int a=sc.nextInt();
       System.out.println("enter b value:");
       int b=sc.nextInt();
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("output:");
       System.out.println("after swapping:\na="+a);
       System.out.println("b="+b);
	}

}