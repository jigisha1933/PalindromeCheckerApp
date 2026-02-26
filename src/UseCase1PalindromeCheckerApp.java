// File: UseCase1PalindromeCheckerApp.java
import java.util.Scanner;

public class UseCase1PalindromeCheckerApp {

    static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // Display app info
        System.out.println("======================================");
        System.out.println(" Palindrome Checker App - UC4 ");
        System.out.println(" Version: " + APP_VERSION);
        System.out.println("======================================\n");

        // UC4: User input palindrome check using char array and two-pointer technique
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check with char array approach: ");
        String uc4Input = sc.nextLine();
        checkPalindromeWithCharArray(uc4Input);
        sc.close();
    }

    // UC4 method: Two-pointer char array approach
    public static void checkPalindromeWithCharArray(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (Character.toLowerCase(chars[start]) != Character.toLowerCase(chars[end])) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4 Result: \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("UC4 Result: \"" + str + "\" is NOT a palindrome.");
        }
    }
}