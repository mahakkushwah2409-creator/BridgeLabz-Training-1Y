import java.util.Scanner;

public class TextComparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input using the Scanner nextLine() method
        System.out.println("Enter a line of text:");
        String userInput = scanner.nextLine();

        // b. Use the user-defined method to convert to uppercase
        String customUppercase = convertToUppercaseCustom(userInput);

        // d. In the main() use the String built-in method toUpperCase() to get the uppercase text
        String builtinUppercase = userInput.toUpperCase();

        // d. Compare the two strings using the user-defined method
        boolean areEqual = compareStringsCustom(customUppercase, builtinUppercase);

        // d. Finally display the result in java using String
        System.out.println("\nOriginal Text: " + userInput);
        System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Built-in Uppercase: " + builtinUppercase);

        if (areEqual) {
            System.out.println("\nThe two uppercase strings match perfectly.");
        } else {
            System.out.println("\nThe strings do not match.");
        }

        scanner.close();
    }

    /**
     * b. Converts a string to uppercase using charAt() and ASCII value logic.
     * Only converts lowercase letters 'a' through 'z'. Other characters remain unchanged.
     */
    public static String convertToUppercaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase using the ASCII difference (32)
                char uppercaseChar = (char) (currentChar - 32);
                result.append(uppercaseChar);
            } else {
                // Append other characters as is (numbers, symbols, already uppercase, etc.)
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    /**
     * c. Compares two strings using the charAt() method and returns a boolean result.
     */
    public static boolean compareStringsCustom(String str1, String str2) {
        // First, check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Found a difference
            }
        }

        return true; // All characters matched and lengths were equal
    }
}