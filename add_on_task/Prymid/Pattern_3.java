package Addon_class;
import java.util.*;

public class Pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 3;
		for(int i=1;i<=n;i++)
		{
			for(int s=0; s<i;s++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
