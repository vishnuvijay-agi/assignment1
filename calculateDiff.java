import java.util.Scanner;

public class calculateDiff
{
       private int sum,sumsq;
       public int calculateDifference(int n)
       {
              for(int i=1;i<=n;i++)
              {
                     sum=sum+i;
              }
              sum = sum*sum;
              for(int i=1;i<=n;i++)
              {
                     sumsq=sumsq+(i*i);
              }
              return sumsq-sum;
       }
       public static void main(String[] ar)
       {
              calculateDiff p = new calculateDiff();
              Scanner s = new Scanner(System.in);
              System.out.println("Enter a number");
              int n = s.nextInt();
              System.out.println(p.calculateDifference(n));
       }
}