import java.util.Scanner;
public class ATM
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to the ATM");
            System.out.println(" 1  :  Withdraw");
            System.out.println(" 2  :  Deposit");
            System.out.println(" 3  :  Check Balance");
            System.out.println(" 4  :  EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = scan.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = scan.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter amount to be deposited:");
                deposit = scan.nextInt();
                balance = balance + deposit;
                System.out.println("Deposit Successfull");
                System.out.println("");
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
            scan.close();
        }
        
    }
    
}