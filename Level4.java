import java.util.Scanner;

public class Level4 {

    // Reverse a number
    int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        return reverse;
    }

    // Factorial of a number
    int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Check prime number
    void isPrime(int num) {

        if (num <= 1) {
            System.out.println(num + " is not prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }

    // Print all prime numbers from 1 to given number
    void printPrimes(int num) {

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    // Sum of digits
    int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Level4 L4 = new Level4();

        // Reverse
        System.out.print("Enter number to reverse: ");
        int num = input.nextInt();
        int reversed = L4.reverse(num);
        System.out.println("Reversed number: " + reversed);

        // Palindrome
        System.out.print("Enter number to check palindrome: ");
        int number = input.nextInt();
        int rev = L4.reverse(number);

        if (number == rev) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

        // Factorial
        System.out.print("Enter number to find factorial: ");
        int n = input.nextInt();
        int fact = L4.factorial(n);
        System.out.println("Factorial is: " + fact);

        // Prime check
        System.out.print("Enter number to check prime: ");
        int primeNum = input.nextInt();
        L4.isPrime(primeNum);

        // Print primes 1 to 100
        System.out.println("Prime numbers from 1 to 100:");
        L4.printPrimes(100);

        // Sum of digits
        System.out.print("\nEnter number to find sum of digits: ");
        int sumNum = input.nextInt();
        int sum = L4.sumOfDigits(sumNum);
        System.out.println("Sum of digits: " + sum);

        input.close();
    }
}