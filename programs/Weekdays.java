import java.util.Scanner;
public class Weekdays {
	public static void main(String[]args)
	{
		int num=0;
		System.out.println("Enter a number from 1 to 7");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if((num>0)&&(num<7) )
		{
			switch (num)
			{
			case 1:
					System.out.println("Sunday");
					break;
			case 2:
					System.out.println("Monday");
					break;
			case 3:
					System.out.println("Tuesday");
					break;
			case 4:
					System.out.println("Wednesday");
					break;
			case 5:
					System.out.println("Thursday");
					break;
			case 6:
					System.out.println("Friday");
					break;
			case 7:
					System.out.println("Saturday");
					break;
			}
			
		}
		else
			System.out.println("Error: Enter valid input");
	}
}

