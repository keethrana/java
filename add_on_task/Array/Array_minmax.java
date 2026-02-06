package Addon_class;

import java.util.Arrays;
import java.util.Scanner;


public class Array_minmax {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		sort(arr);
	}
		
		static void sort(int[] arr)
		{
			
			for(int i=0; i<arr.length-1; i++)
			{
				for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t; 
				}
				}
			}
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			
			System.out.println(arr[0]);
			System.out.println(arr[arr.length-1]);
			
		}
		
	}
