// File: UseCase1PalindromeCheckerApp.java
public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Optional: Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC2 ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println(" This app checks a hardcoded palindrome.");
        System.out.println("======================================\n");

        // UC2: Hardcoded palindrome check
        String hardcodedString = "madam"; // Change to any word you want
        checkHardcodedPalindrome(hardcodedString);
    }

    // UC2 method
    public static void checkHardcodedPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("UC2 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC2 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}