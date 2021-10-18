package regular.expressions;

import java.util.Scanner;
public class PrimeSeries
{

static void printprime(int n)
{
	int i,j,flag;

	System.out.println("Prime numbers between 1 and "+ n + " are:");

	for (i = 1; i <= n; i++)
	{
		if (i == 1 || i == 0)
			continue;
		flag = 1;

		for (j = 2; j <= i / 2; ++j)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			System.out.print(i + " ");
	}
}
public static void main (String[] args)
{	System.out.println("Enter the end value : ");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();

	printprime(n);
}
}
