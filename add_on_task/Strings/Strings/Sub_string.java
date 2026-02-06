package Strings;
import java.util.*;

public class Sub_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "abcdef";
		String str2 = "cde";
		String temp;
		
		for(int i=0; i<str.length(); i++)
		{
			temp = "";
			boolean isTrue = false;
			for(int j=i;j<str.length(); j++)
			{
				temp+=str.charAt(j);
				if(temp.equals(str2))
				{
					isTrue = true;
					System.out.println(i);
					break;
				}
			}
			if(isTrue)
			{
				break;
			}
		}

	}

}
