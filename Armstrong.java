package regular.expressions;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
    	int number = 0, initial, rem, result = 0;
    	System.out.println("Enter a number : ");
    	Scanner scan=new Scanner(System.in);
    	number=scan.nextInt();
        

        initial = number;

        while (initial != 0)
        {
            rem = initial % 10;
            result += Math.pow(rem, 3);
            initial /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}