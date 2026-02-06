package Addon_class;

import java.util.*;
public class Num_prymid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            for(int s =i;s  <n;s++){
//                System.out.print("  ");
//            }
//            for(int j =i;j>=0;j--){
//                System.out.print(j+" ");
//            }
//            for(int k = 1; k<=i;k++){
//                System.out.print(k+" ");
//            }
//            System.out.println();
//        }
        for(int i=0; i<n;i++)
        {
        	int t=i;
        	for(int s=0; s<n-i; s++)
        	{
        		System.out.print("  ");
        	}
        	for(int j=0;j<(i*2)+1;j++)
        	{
        			System.out.print(Math.abs(t--) +" ");
        	}
        	System.out.println();
        }
    }
}