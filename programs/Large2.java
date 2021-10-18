import java.util.Scanner;

public class Large2 
{
    public static void main(String args[])
    {
        int num1,num2, result;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter Two Numbers one after the other : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
      
        if(num1>num2)
        {
            result= num1;
        }
        else
        {
        	result= num2;
        }
      
        System.out.print("Largest of Two Number is " +result);
    }
}