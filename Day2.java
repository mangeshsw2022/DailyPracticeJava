import java.util.Scanner;

public class Day2 {

    Scanner input = new Scanner(System.in);

    public void reverce_Num(int num) {
        int reverse_num = 0;

        while (num > 0) {
             int digit = num % 10;     // last digit
            reverse_num = reverse_num * 10 + digit;
            num = num / 10;
        }

        System.out.print(reverse_num);
    }

    public void  palindrome(int num)
    {
        int reverse_num = 0;
        int num1=num;
        
        while (num > 0) {
             int digit = num % 10;     // last digit
            reverse_num = reverse_num * 10 + digit;
            num = num / 10;
        }

        if (reverse_num==num1) {
            System.out.print("number is palindrom.");
        }
        else{
            System.out.print("number is not palindrom.");
        }
    }

     public void factorial(int num) {

        while (num > 0) {
             int digit = num % 10;     // last digit
            fact_num =
            num = num / 10;
        }

        System.out.print(reverse_num);
    }
    public static void main(String[] args) {

        Day2 d2 = new Day2();

        d2.reverce_Num(12345);

        // Check whether a number is a palindrome.

        d2.palindrome(131);

        // Find the factorial of a number.



        // Check whether a number is prime.

        // Print all prime numbers between 1 and 100.

        // Find the sum of digits of a number.
    }

}
