public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC2 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string to check
        String word = "madam";

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("UC2 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC2 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}