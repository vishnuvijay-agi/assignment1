import java.util.Scanner;
public class Sign {

	public static void main(String[] args) {
		int num1 = 0 ;
		System.out.println("Enter a number");
		Scanner scan= new Scanner(System.in);
		num1=scan.nextInt();
		
		if (num1 > 0) {
			System.out.println("The entered number is Positive");
		}
		else
			System.out.println("The entered number is Negative");
		scan.close();
	}

}
