import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) 
	{
		int number, i;
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Enter a number : ");
		number = scan.nextInt();	
		
		for(i = number; i >= 1; i--)
		{
			System.out.println(i); 
		}
		scan.close();
	}
}