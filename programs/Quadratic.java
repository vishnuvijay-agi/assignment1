import java.util.Scanner;
import java.math.*;
public class Quadratic {

    
  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            int a = input.nextInt();
            System.out.print("Input b: ");
            int b = input.nextInt();
            System.out.print("Input c: ");
            int c = input.nextInt();

            float result = (float) (b * b - 4.0 * a * c);

            if (result > 0.0) {
                float r1 = (float) ((-b + Math.sqrt(result)) / (2.0 * a));
                float r2 = (float) ((-b -Math.sqrt(result)) / (2.0 * a));
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                float r1 = (float) (-b / (2.0 * a));
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}