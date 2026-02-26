import java.util.Stack;

public class UseCase1PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC5 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string to check
        String word = "level";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("UC5 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC5 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}