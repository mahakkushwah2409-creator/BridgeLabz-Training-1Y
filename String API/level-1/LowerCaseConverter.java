import java.util.Scanner;

public class LowercaseConverter {

    /**
     * Converts the input string to lowercase using charAt() and ASCII values.
     *
     * @param text The input string.
     * @return The lowercase string.
     */
    public static String convertToLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the character is an uppercase letter (ASCII A-Z)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase using the ASCII difference (32)
                result.append((char) (currentChar + 32));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    /**
     * Compares two strings character by character using charAt().
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return true if the strings are identical, false otherwise.
     */
    public static boolean compareStringsCustom(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input
        System.out.println("Enter a line of text (mix of cases):");
        String originalText = scanner.nextLine();

        // b. Use the custom method to convert to lowercase
        String customLowerCase = convertToLowerCaseCustom(originalText);
        System.out.println("Custom lowercase version: " + customLowerCase);

        // d. Use the built-in method to get the lowercase text
        String builtInLowerCase = originalText.toLowerCase();
        System.out.println("Built-in lowercase version: " + builtInLowerCase);

        // d. Compare the two strings using the user-defined comparison method
        boolean areEqual = compareStringsCustom(customLowerCase, builtInLowerCase);

        // d. Display the result
        if (areEqual) {
            System.out.println("The custom method and the built-in toLowerCase() method produce the same result.");
        } else {
            System.out.println("The methods produced different results.");
        }

        scanner.close();
    }
}
