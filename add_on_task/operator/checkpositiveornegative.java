package operator;

import java.util.Scanner;

public class checkpositiveornegative {

	public static void main(String[] args) {
//		//2. Check if a given integer is positive or negative
//		   Write a program to check whether the given integer is positive, negative, or zero.*
//		   Sample Input: -12
//		   Sample Output: Negative
//		   
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println(" Input:");
    n=sc.nextInt();
    System.out.print(" Output:");
    if(n>0)
    {
    	System.out.println("Positive");
    }
    else if(n<0)
    {
    	System.out.println("Negative");
    }
    else
    {
    	System.out.println("zero");
    }

	}

}