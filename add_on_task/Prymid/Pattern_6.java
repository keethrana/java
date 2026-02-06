package Addon_class;
import java.util.*;


public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+i +" ");
			}

			System.out.println();
		}


	}

}