import java.util.Scanner;
public class Factorial {
   public static void main(String args[])
   {
      int i =1, factorial=1, number;
      System.out.println("Enter the number :");
      Scanner scan = new Scanner(System.in);
      number = scan.nextInt();

      while(i <=number) 
      {
         factorial = factorial * i;
         i++;
      }
      System.out.println("Factorial of"+" "+number+" "+"is: "+" "+factorial);
   }
}