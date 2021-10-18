import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    
    int num = 0, rnum = 0, rem;
    Scanner scan= new Scanner(System.in);
    num= scan.nextInt();
    int originalNum = num;
    while (num != 0) {
      rem = num % 10;
      rnum = rnum * 10 + rem;
      num /= 10;
    }
    if (originalNum == rnum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}