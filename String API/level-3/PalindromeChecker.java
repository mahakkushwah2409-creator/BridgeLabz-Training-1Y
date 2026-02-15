import java.util.Scanner;

public class PalindromeChecker {

  
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            // Convert to lowercase and ignore non-alphanumeric characters for a more robust check
            char startChar = Character.toLowerCase(text.charAt(start));
            char endChar = Character.toLowerCase(text.charAt(end));

            if (!Character.isLetterOrDigit(startChar)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                end--;
                continue;
            }

            if (startChar != endChar) {
                return false; // Not a palindrome
            }

            start++;
            end--;
        }
        return true; // Is a palindrome
    }

    // --- Logic 2: Recursive Method ---
    /**
     * Checks if a string is a palindrome using recursion.
     *
     * @param text The original string (used for the public call).
     * @return true if the text is a palindrome, false otherwise.
     */
    public static boolean isPalindromeRecursive(String text) {
        // Prepare string for a cleaner check (lowercase, remove non-alphanumeric)
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeRecursiveHelper(cleanText, 0, cleanText.length() - 1);
    }

    /**
     * Helper method for the recursive palindrome check.
     */
    private static boolean isPalindromeRecursiveHelper(String text, int start, int end) {
        // Base case 1: When the start index crosses or meets the end index, the string is a palindrome
        if (start >= end) {
            return true;
        }

        // Base case 2: If characters at current positions don't match, it's not a palindrome
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive step: Move inwards by one character from both ends
        return isPalindromeRecursiveHelper(text, start + 1, end - 1);
    }

    // --- Logic 3: Character Arrays Method (Reverse and Compare) ---
    /**
     * Checks if a string is a palindrome by reversing it and comparing to the original.
     *
     * @param text The string to check.
     * @return true if the text is a palindrome, false otherwise.
     */
    public static boolean isPalindromeCharArray(String text) {
        // For simplicity with this logic, we use the raw input string
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseStringUsingCharAt(text);

        // Compare the original and reversed arrays
        if (originalArray.length != reversedArray.length) {
            return false; // Should not happen with valid input
        }

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Helper method to reverse a string using charAt().
     * Returns the reversed string as a character array.
     */
    private static char[] reverseStringUsingCharAt(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }


    // --- Main Method to Test Logics ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        System.out.println("\n--- Results for: \"" + input + "\" ---");

        // Test Logic 1 (Iterative)
        boolean res1 = isPalindromeIterative(input);
        System.out.println("Logic 1 (Iterative): " + (res1 ? "Is a Palindrome" : "Is NOT a Palindrome"));

        // Test Logic 2 (Recursive)
        boolean res2 = isPalindromeRecursive(input);
        System.out.println("Logic 2 (Recursive): " + (res2 ? "Is a Palindrome" : "Is NOT a Palindrome"));

        // Test Logic 3 (Character Arrays)
        boolean res3 = isPalindromeCharArray(input);
        System.out.println("Logic 3 (Character Arrays): " + (res3 ? "Is a Palindrome" : "Is NOT a Palindrome"));

        scanner.close();
    }
}
