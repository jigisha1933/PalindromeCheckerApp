import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC6 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string to check
        String word = "radar";

        // Queue for FIFO
        Queue<Character> queue = new LinkedList<>();
        // Stack for LIFO
        Stack<Character> stack = new Stack<>();

        // Add characters to queue and stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);  // Enqueue
            stack.push(ch); // Push
        }

        // Compare queue and stack
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("UC6 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC6 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}