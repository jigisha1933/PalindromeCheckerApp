public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC4 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string to check
        String word = "mom";

        // Convert string to char array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println("UC4 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC4 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}