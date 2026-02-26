public class UseCase1PalindromeCheckerApp {

    // Recursive method to check palindrome
    private static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;  // Base case
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC9 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string
        String word = "racecar";

        // Check palindrome using recursion
        boolean result = isPalindromeRecursive(word, 0, word.length() - 1);

        // Print result
        if (result) {
            System.out.println("UC9 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC9 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}