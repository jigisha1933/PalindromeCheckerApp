import java.util.*;

public class UseCase1PalindromeCheckerApp {

    // UC13: Different palindrome algorithms as static methods

    // Method 1: Reverse string using loop
    public static boolean isPalindromeReverseLoop(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Method 2: Two-pointer character array
    public static boolean isPalindromeTwoPointer(String word) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Stack-based
    public static boolean isPalindromeStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (char c : word.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC13 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        String word = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba"; // long palindrome

        // Measure Reverse Loop
        long start = System.nanoTime();
        boolean result1 = isPalindromeReverseLoop(word);
        long end = System.nanoTime();
        System.out.println("Reverse Loop: " + (result1 ? "Palindrome" : "Not Palindrome") + ", Time: " + (end - start) + " ns");

        // Measure Two-Pointer
        start = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(word);
        end = System.nanoTime();
        System.out.println("Two-Pointer: " + (result2 ? "Palindrome" : "Not Palindrome") + ", Time: " + (end - start) + " ns");

        // Measure Stack
        start = System.nanoTime();
        boolean result3 = isPalindromeStack(word);
        end = System.nanoTime();
        System.out.println("Stack: " + (result3 ? "Palindrome" : "Not Palindrome") + ", Time: " + (end - start) + " ns");
    }
}