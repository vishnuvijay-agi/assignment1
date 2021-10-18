import java.util.Scanner;
public class Sum {

    
  public static void main(String[] args)

{
   int i, n, sum=0;
   {
   Scanner scan = new Scanner(System.in);  
        System.out.print("Input number: ");  
         n = scan.nextInt();
}
  System.out.println("Numbers are: "+n);
  
 for(i=1;i<=n;i++)
   {
     System.out.println(i);
     sum+=i;
   }
System.out.println("The Sum  "+sum);

}
}