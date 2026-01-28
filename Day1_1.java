import java.util.Scanner;

class Day1_1 {
    public static void main(String[] ages) {
        int num = 10;
        boolean ch = true;

        while (ch = true) {
            Scanner input = new Scanner(System.in);
            System.out.print("\n\n1.Print numbers from 1 to 10.\r\n" +
                    "2.Print numbers from 10 to 1.\r\n" +
                    "3.Print even numbers between 1 and 50.\r\n" +
                    "4.Find the sum of first N natural numbers.\r\n" +
                    "5.Print the multiplication table of a given number.\r\n" +
                    "6.Count the number of digits in a number.\r\n"+
                    "7.exit.\n\n");
            System.out.print("Enter Program(1-7):");

            int n = input.nextInt();

            switch (n) {
                case 1:
                    // Print numbers from 1 to 10.
                    System.out.print("Numbers from 1 to 10:");
                    for (int i = 1; i <= num; i++) {
                        System.out.print(" " + i);
                    }
                    break;

                case 2:
                    // Print numbers from 10 to 1.
                    System.out.print("Numbers from 10 to 1:");
                    for (int i = num; i >= 1; --i) {
                        System.out.print(" " + i);
                    }
                    break;

                case 3:
                    // Print even numbers between 1 and 50.
                    System.out.print("Even Numbers 1-50:");
                    for (int i = 1; i <= 50; i++) {
                        if (i % 2 == 0) {
                            System.out.print(" " + i);
                        }
                    }
                    break;

                case 4:
                    // Find the sum of first N natural numbers.
                    System.out.print("Enter Number: ");
                    int number = input.nextInt();
                    System.out.print("sum of first" + number + " natural numbers:");
                    int sum = 0;
                    for (int i = 0; i <= number; i++) {
                        sum += i;
                    }
                    System.out.print(" " + sum);
                    break;

                case 5:
                    // Print the multiplication table of a given number.
                    System.out.print("Which Table:");
                    int table = input.nextInt();
                    System.out.print("Table:");
                    for (int i = 1; i <= 10; i++) {
                        int multi = table * i;
                        System.out.print(" " + multi);
                    }
                    break;
                case 6:
                    // Count the number of digits in a number.
                    System.out.print("Enter Number:");
                    long numb = input.nextInt();
                    int count = 1;
                    for (int i = 0; i < numb; i++) {
                        numb = numb / 10;
                        ++count;
                    }
                    System.out.print("Number Of Digits: " + count);
                    break;
                case 7:
                    // exit
                    ch=false;
                    break;
                default:
                    System.out.print("enter vaild charecter..!\nselect 1-7");
            }
        }

    }

}
