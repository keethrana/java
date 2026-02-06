package Addon_class;
import java.util.*;


public class Shuffle_box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>n)
				{
					System.out.print((i+j)-n +" ");
				}
				else
				{
					System.out.print(j+i +" ");
				}
//				System.out.print(((i+j)%n+1)+ " ");
			}

			System.out.println();
		}


	}

}