package Inheritance;

import java.util.Scanner;

public class Students_inheri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Students: ");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] rollno = new int[n];
		String[] dep = new String[n];
		int[] mark = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the Student "+(i+1));
			
			System.out.println("Enter the Name: ");
			name[i] = sc.next();
			
			System.out.println("Enter the Rollno: ");
			rollno[i] = sc.nextInt();
			
			System.out.println("Enter the Department: ");
			dep[i] = sc.next();
			
			System.out.println("Total Mark: ");
			mark[i] = sc.nextInt();
		}
		System.out.println("------------Students Details--------------");
		for(int i=0; i<n; i++) {
			System.out.println("Student "+(i+1)+" Details");

			System.out.println("Student Name: "+name[i]);
			System.out.println("Rollno: "+rollno[i]);
			System.out.println("Department: "+dep[i]);
			System.out.println("Mark: "+mark[i]);
		}
	}

}
