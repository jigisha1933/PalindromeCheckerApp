import java.util.*;

public class UseCase1PalindromeCheckerApp {

    // Palindrome strategy interface
    interface PalindromeStrategy {
        boolean isPalindrome(String word);
    }

    // Stack-based strategy
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String word) {
            Stack<Character> stack = new Stack<>();
            for (char c : word.toCharArray()) stack.push(c);
            for (char c : word.toCharArray()) {
                if (c != stack.pop()) return false;
            }
            return true;
        }
    }

    // Deque-based strategy
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String word) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : word.toCharArray()) deque.add(c);
            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) return false;
            }
            return true;
        }
    }

    // Context class to use strategy
    static class PalindromeChecker {
        private PalindromeStrategy strategy;

        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String word) {
            return strategy.isPalindrome(word);
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC12 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        String word = "level";

        // Choose strategy dynamically
        PalindromeChecker checker = new PalindromeChecker(new StackStrategy());
        boolean resultStack = checker.check(word);

        checker.setStrategy(new DequeStrategy());
        boolean resultDeque = checker.check(word);

        System.out.println("UC12 Result using StackStrategy: " + (resultStack ? "Palindrome" : "Not Palindrome"));
        System.out.println("UC12 Result using DequeStrategy: " + (resultDeque ? "Palindrome" : "Not Palindrome"));
    }
}