package operator;

import java.util.Scanner;

public class swapusingtemp {

	public static void main(String[] args) {
//		4. Swap two numbers using a temporary variable
//		   Write a program to swap two integers using a temporary variable.*
//		   Sample Input: a = 5, b = 10
//		   Sample Output: a = 10, b = 5
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    System.out.println("enter b value");
    int b=sc.nextInt();
    int temp=0;
    temp=a;
    a=b;
    b=temp;
    System.out.println("output:\na="+a);
    System.out.println("b="+b);
    

	}

}