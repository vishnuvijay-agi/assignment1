import java.util.Scanner;
public class OddEvenSum {
	private static Scanner scan;
	public static void main(String[] args) 
	{
		int number=0, i, evenSum = 0, oddSum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		number = scan.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
		scan.close();
	}
}

