package Addon_class;
import java.util.*;

public class Butterfly_pattern {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<(n*2)-1;i++)
		{
			if(i<(((n*2)-1)/2))
			{
				for(int j=0;j<i+1;j++)
				{
					System.out.print("*");
				}
				for(int s=0;s<((n*2)-(i*2));s++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<i+1;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				
			}
			System.out.println();
		}
	}
}
