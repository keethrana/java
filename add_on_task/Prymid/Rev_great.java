package Addon_class;

public class Rev_great {

	public static void main(String[] args) {
		int n = 1241;
		int t = n;//1241
		int r,sum=0;
		while(t!=0)
		{
			r = t%10;//1 //4 //2 //1
			sum = (sum*10)+r;//1 //14 //142 //1421
			t=t/10;//124 //12 //1 //0
		}
		if(n>sum)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(sum);
		}

	}

}
