import java.util.*;
import java.util.Arrays;

public class AlphaCheck {

	static boolean isAlphabaticOrder(String s)
	{		
		int n = s.length();
		char c[] = new char [n];
		for (int i = 0; i < n; i++) {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 0; i < n; i++)
			if (c[i] != s.charAt(i))
				return false;
			
		return true;	
	}
	
	public static void main(String args[])
	{
		System.out.println("ENter a word:");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		if (isAlphabaticOrder(s))
		System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
}
