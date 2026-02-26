// File: UseCase1PalindromeCheckerApp.java
import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println("======================================\n");

        // UC2: Hardcoded palindrome check
        String hardcodedString = "madam";
        checkHardcodedPalindrome(hardcodedString);

        // UC3: User input palindrome check using loop
        Scanner sc = new Scanner(System.in);
        System.out.print("\nUC3: Enter a string to check if it's a palindrome: ");
        String userInput = sc.nextLine();
        checkPalindromeWithLoop(userInput);
        sc.close();
    }

    // UC2 method: Using StringBuilder.reverse()
    public static void checkHardcodedPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("UC2 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC2 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }

    // UC3 method: Reverse using loop
    public static void checkPalindromeWithLoop(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("UC3 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC3 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}