// File: UseCase1PalindromeCheckerApp.java
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC6 ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println("======================================\n");

        // UC6: User input palindrome check using Queue + Stack
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check using Queue + Stack approach: ");
        String userInput = sc.nextLine();
        checkPalindromeWithQueueStack(userInput);
        sc.close();
    }

    // UC6 method: Queue + Stack based palindrome check
    public static void checkPalindromeWithQueueStack(String str) {
        String original = str.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both queue and stack
        for (char c : original.toCharArray()) {
            queue.add(c);  // FIFO
            stack.push(c); // LIFO
        }

        boolean isPalindrome = true;

        // Compare queue (FIFO) vs stack (LIFO)
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC6 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}