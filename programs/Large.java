import java.util.Scanner;

public class Large {

    public static void main(String[] args) {

       
       int num1,num2,num3, result;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter three numbers: ");
       num1 = scan.nextInt();
       num2 = scan.nextInt();
       num3 = scan.nextInt();
       if(num1 >= num2) {
            if(num1 >= num3) result = num1;
            else result = num3;
       } else {
            if(num2>=num3) result = num2;
            else result = num3;
       }
       System.out.println("Largest number = "+ result);

     }
 }