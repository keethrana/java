package operator;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
//		6. Check whether a number is odd or even
//		   Write a program to check if the given integer is odd or even.*
//		   Sample Input: 7
//		   Sample Output: Odd

  Scanner sc=new Scanner(System.in);
  System.out.println("enter the input:");
  int n=sc.nextInt();
  if(n%2!=0)
  {
	  System.out.println("output:odd");
  }
  else
  {
	  System.out.println("output:even");
  }
  sc.close();
	}
	

}