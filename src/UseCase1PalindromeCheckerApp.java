public class UseCase1PalindromeCheckerApp {

    // Method to check palindrome ignoring case and spaces
    private static boolean isPalindromeIgnoreCaseAndSpace(String str) {
        // Normalize string: remove spaces and convert to lower case
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Use two-pointer approach
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC10 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string
        String word = "A man a plan a canal Panama";

        // Check palindrome ignoring spaces and case
        boolean result = isPalindromeIgnoreCaseAndSpace(word);

        // Print result
        if (result) {
            System.out.println("UC10 Result: \"" + word + "\" is a palindrome (case & space ignored).");
        } else {
            System.out.println("UC10 Result: \"" + word + "\" is NOT a palindrome (case & space ignored).");
        }
    }
}