package regular.expressions;

import java.util.Scanner;
public class CubeSeries {

 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in); 
     int n,i=1;
     System.out.println("Enter the range of number(Limit):");
     n=scan.nextInt();
     while(i<=n)
     {
      System.out.print(i*i*i+" ");
      i++;
      }
      scan.close();
 }
}