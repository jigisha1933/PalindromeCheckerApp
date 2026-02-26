public class UseCase1PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Helper method to reverse a linked list
    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Helper method to check palindrome
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare first half and reversed second half
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean palindrome = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // Restore the original list (optional)
        slow.next = reverse(secondHalf);

        return palindrome;
    }

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC8 ");
        System.out.println(" Version: 1.0");
        System.out.println("======================================\n");

        // Hardcoded string
        String word = "level";

        // Convert string to linked list
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println("UC8 Result: \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("UC8 Result: \"" + word + "\" is NOT a palindrome.");
        }
    }
}