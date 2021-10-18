import java.util.Scanner;
public class Numbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1=0;
		System.out.println("Enter a number :");
	    Scanner scan=new Scanner(System.in);
	    num1=scan.nextFloat();
		if (num1==0) {
			System.out.println("Zero");	
		}
		else if (num1 > 0) 
			{
			System.out.println("The entered number is Positive");
			if (num1>1000000) 
			{
				System.out.println("Large"+ " " + num1);
		    }
			
			else if( num1<1)
				{
				System.out.println("Small" + " " +num1);
				}
			}
		else {
			System.out.println("The entered number is negative"+"" );	
			 
			if (num1<-1000000) 
			{
				System.out.println("Large"+ " " + num1);
		    }
			
			else if( num1>-1)
				{
				System.out.println("Small" + " " +num1);
				}
			}
	}

}
