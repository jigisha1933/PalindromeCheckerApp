public class UseCase1PalindromeCheckerApp {

    // Palindrome service class
    static class PalindromeChecker {
        private String word;

        // Constructor
        public PalindromeChecker(String word) {
            this.word = word;
        }

        // Method to check palindrome using stack
        public boolean checkPalindrome() {
            java.util.Stack<Character> stack = new java.util.Stack<>();
            for (char c : word.toCharArray()) {
                stack.push(c);
            }

            for (char c : word.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC11 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string
        String word = "radar";

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(word);

        // Check palindrome
        boolean result = checker.checkPalindrome();

        // Print result
        if (result) {
            System.out.println("UC11 Result: \"" + word + "\" is a palindrome (OOP approach).");
        } else {
            System.out.println("UC11 Result: \"" + word + "\" is NOT a palindrome (OOP approach).");
        }
    }
}