package Addon_class;

public class Num_revv
{
	public static void main(String[] args) {
		int n1 = 1234567;
		int n=n1;
		int n2=0; 
		int count =0;
		
		while(n>0){
		    
		    n = n/10;
		    count++;
		}
//		System.out.println(count);
		double c = Math.floor(count/2);
		int i=0;
		while(i<(c))
		{
			n2 = (n2*10) + (n1%10);
			n1=n1/10;
			i++;
		}
		
		for(int j=0;j<c;j++)
		{
			n1*=10;
		}
		
		System.out.println(n1+n2);
//		System.out.println(n2);
	}
}