import java.util.Scanner;

public class Level6 {

    // 1️⃣ Count Length
    public static int countLength(String str) {
        return str.length();
    }

    // 2️⃣ Reverse String
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // 3️⃣ Palindrome Check
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    // 4️⃣ Count Vowels and Consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // 5️⃣ Count Words
    public static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    // Main Method (Testing All Methods)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Length: " + countLength(input));
        System.out.println("Reversed: " + reverseString(input));

        if (isPalindrome(input)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }

        countVowelsAndConsonants(input);

        System.out.println("Word Count: " + countWords(input));
    }
}