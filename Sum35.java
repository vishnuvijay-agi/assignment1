import java.util.Scanner;

public class Sum35
{
       private int s=0;
       public int calculateSum(int n)
       {
              for(int i=0;i<=n;i++)
              {
                     if(i%3==0||i%5==0)
                     {
                           s=s+i;
                     }
              }
              return s;
       }
       public static void main(String[] ar)
       {
              Sum35 p1 = new Sum35();
              Scanner s = new Scanner(System.in);
              int n=s.nextInt();
              System.out.println(p1.calculateSum(n));
       }
}