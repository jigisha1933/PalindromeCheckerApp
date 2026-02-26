// File: UseCase1PalindromeCheckerApp.java
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC7 ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println("======================================\n");

        // UC7: User input palindrome check using Deque
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check using Deque approach: ");
        String userInput = sc.nextLine();
        checkPalindromeWithDeque(userInput);
        sc.close();
    }

    // UC7 method: Deque-based palindrome check
    public static void checkPalindromeWithDeque(String str) {
        String original = str.toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        // Add all characters to the deque
        for (char c : original.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC7 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC7 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}