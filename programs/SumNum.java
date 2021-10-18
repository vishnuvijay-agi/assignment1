import java.util.Scanner;  
	public class SumNum  
	{  
			public static void main(String args[])  
			{  
				int num, digit, sum = 0;  
				Scanner scan = new Scanner(System.in);  
				System.out.print("Enter the number: ");  
				num = scan.nextInt();  
				while(num > 0)  
				{     
					digit = num % 10;    
					sum = sum + digit;  
					num = num / 10;  
				}  
					System.out.println("Sum of Digits: "+sum);  
					scan.close();
			}  
}  