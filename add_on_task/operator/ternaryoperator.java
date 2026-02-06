package operator;

import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args) {
//		Find maximum of 2, 3, and 4 numbers using ternary operator
//		   Write a program to determine the maximum among 2, 3, and 4     integers using ternary operator.*
//		   Sample Input: 5 8 3 10
//		   Sample Output: Maximum: 10

	
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,d;
		System.out.println(" Input:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		int m1=(a>b)? a:b;
		int m2=(m1>c)? m1:c;
		int max=(m2>d)? m2:d;
		
		
		
		System.out.println("Output:");
		System.out.println(" Output: maximum "+max);
       sc.close();
	}

}