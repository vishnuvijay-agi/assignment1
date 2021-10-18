import java.util.Scanner;

public class LowForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,hcf=0;
		System.out.println("Enter the two numbers");
		Scanner scan=new Scanner(System.in);
		num1=scan.nextInt();
		num2=scan.nextInt();
		System.out.println("Entered number is ::"+num1+"/"+num2);
		for(int i = 1; i <= num1 || i <= num2; i++) {
	         if( num1%i == 0 && num2%i == 0 )
	         hcf = i;
	      }
		
	      System.out.println("Result ::"+num1/hcf+"/"+num2/hcf);
	      scan.close();
	}

}
