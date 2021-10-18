import java.util.Scanner;
public class Cube {

   public static void main(String[] args)

{
    int i,n;

    System.out.print("Enter the number : ");
    Scanner scan = new Scanner(System.in);
		    n = scan.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("Cube of : " +i+" "+ ":"+(i*i*i));     
    }
     scan.close();
 }
}