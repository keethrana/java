package Addon_class;

import java.util.Scanner;

public class Array_DupliNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		
			
		for(int i=0; i<arr.length-1; i++)
			{
				for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					System.out.println(arr[i]+","+arr[j]+" ");
				if(arr[j]>arr[i])
				{
					System.out.println();
				}
			}
				}
				}
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
			
			

	}

}
