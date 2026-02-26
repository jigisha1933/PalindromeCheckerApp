// File: UseCase1PalindromeCheckerApp.java
import java.util.Scanner;
import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC5 ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println("======================================\n");

        // UC5: User input palindrome check using Stack
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check using stack approach: ");
        String userInput = sc.nextLine();
        checkPalindromeWithStack(userInput);
        sc.close();
    }

    // UC5 method: Stack-based palindrome check
    public static void checkPalindromeWithStack(String str) {
        Stack<Character> stack = new Stack<>();
        String original = str.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        // Push all characters into the stack
        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to get reversed string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare original and reversed
        if (original.equals(reversed.toString())) {
            System.out.println("UC5 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC5 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}