import java.util.Scanner;
public class DigitCheck
{
  public static void main(String[] args) 
  {
	  System.out.println("Enter the number:");
	  Scanner scan=new Scanner(System.in);
	  int num1=scan.nextInt();
	  System.out.println("Enter the digit:");
	   int num2=scan.nextInt();
	   int right , flag=0;
	   do 
	   {
		   right=num1%10;
		   if(right==num2)
		   	{
			   System.out.println("Number exists:");
			   flag=1;
			   break;
		   	}
		   else{
			   		num1=num1/10;
		   		}
	   	}while(num1!=0);
	   if (flag==0) 
		   System.out.println("Number does not exist");
	   
  }
}
