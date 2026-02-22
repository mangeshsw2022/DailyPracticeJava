import java.util.Scanner;

public class Level3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // 🔹 Level 3: Loops (for / while)

        // Print numbers from 1 to 10.
        System.out.print("Print numbers from 1 to 10 :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" "+i);
        }
        System.out.println();

        // Print numbers from 10 to 1.
        for (int a = 1; a <= 10; a++) {
            System.out.print(" "+(11 - a));
        }
        System.out.println();

        // Print even numbers between 1 and 50.
        System.out.println("Print even numbers between 1 and 50. :");
        for (int b = 1; b <= 50; b++) {
            if (b % 2 == 0) {
                System.out.print(" " + b);
            }

        }
        System.out.println();

        // Find the sum of first N natural numbers.
        System.out.println("sum of first N natural numbers :");
        int sum = 0;
        int n=input.nextInt();
        for (int c = 0; c <= n; c++) {
            sum += c;
        }
        System.out.println("sum :" + sum);
        System.out.println();

        // Print the multiplication table of a given number.
        System.out.println("Print the multiplication table of a given number :");
        int multi = input.nextInt();
        for (int d = 1; d <= 10; d++) {
            int table=multi * d;
            System.out.print(table+" ");
        }
        System.out.println();

        // Count the number of digits in a number.
        System.out.println("Count the number of digits in a number :");
        int number = input.nextInt(); 
        int count = 0;
        // Use Math.abs() to handle negative numbers
        int temp = Math.abs(number);

        if (temp == 0) {
            count = 1; // Special case for 0
        } else {
            while (temp != 0) {
                temp = temp / 10; // Remove the last digit
                count++; // Increment the counter
            }
        }
        System.out.println("The number of digits is: " + count);
    }
}
