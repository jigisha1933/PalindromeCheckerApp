import java.util.Deque;
import java.util.LinkedList;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC7 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string
        String word = "deified";

        // Create a deque
        Deque<Character> deque = new LinkedList<>();

        // Add characters to deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Two-pointer comparison using deque
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("UC7 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC7 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}