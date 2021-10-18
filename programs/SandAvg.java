import java.util.Scanner;
public class SandAvg {

    
  public static void main(String[] args)

{       
    int i,n=0,sum=0;
	int avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner scan = new Scanner(System.in);
		    n = scan.nextInt();
		    
  		sum +=n;
	}
	avg=sum/5;
	System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
 
}
}