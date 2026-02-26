public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC3 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string for demonstration
        String word = "racecar";

        // Reverse the string manually using loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("UC3 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC3 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}