import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return str.equalsIgnoreCase(reversed);
    }

    // Function to display result
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        String input = takeInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}