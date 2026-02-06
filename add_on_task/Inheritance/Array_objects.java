package Inheritance;

import java.util.Scanner;

class Detail {
    Scanner sc = new Scanner(System.in);
    int rollno;
    String name;
    String dep;
}

class Get_detail extends Detail {
    void get() {
        System.out.print("Enter roll no: ");
        rollno = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter department: ");
        dep = sc.nextLine();
    }
}

class Display extends Get_detail {
    void dis() {
        System.out.println("Roll_no: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep);
        System.out.println("----------------------");
    }
}

public class Array_objects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of students: ");
        int n = s.nextInt();
        s.nextLine();

        Display[] students = new Display[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i] = new Display();
            students[i].get();
        }

        System.out.println("\n--- All students ---");
        for (int i = 0; i < n; i++) {
            students[i].dis();
        }
        
        s.close();

    }
}
