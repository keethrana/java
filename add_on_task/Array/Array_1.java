package Addon_class;
import java.util.*;

public class Array_1 {

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size");  
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the Elements"); 
		for (i=0;i<n;i++)
		{
			arr[i] =sc.nextInt();
		}
		
		
		System.out.println("The Array Elements is:"); 
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+"\t");
		}
		System.out.println();
		
		for (i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("\n"+(arr[i])+" is Even");
			}
			else
			{
				System.out.println("\n"+arr[i]+" is Odd");
			}
		}
	}

}
