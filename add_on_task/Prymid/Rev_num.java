package Addon_class;

public class Rev_num {

	public static void main(String[] args) {
		int n = 51234;
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
