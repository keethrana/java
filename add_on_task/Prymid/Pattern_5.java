package Addon_class;
import java.util.*;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 3;
		for(int i=1;i<=n;i++)
		{
			for(int s=0; s<(n-i);s++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
