import java.util.Scanner;

public class MulTable {

    public static void main(String[] args) {

        int num = 0;
        System.out.println("Enter a number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.print(num+" "+"*"+" "+i+" "+"="+" "+" "+num*i+" \n");
        }
        scan.close();
    }
}