package Addon_class;

import java.util.*;
public class Num_rev_sq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int j;

        for(int i=0; i<n;i++)
        {
        	if(i%2==0)
        	{
        		for(j=0;j<n;j++)
        		{
        			System.out.print(j+1 +" ");
        		}
        		System.out.println();
        	}
        	else
        	{
        		for(int k=n;k>0;k--)
        		{
        			System.out.print(k +" ");
        		}
        	}
        	System.out.println();
        }
    }
}
