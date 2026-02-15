import java.util.Scanner;

public class StringComparison {


    public static boolean customCompare(String str1, String str2) {
        // First, check if the lengths are different. If so, they cannot be equal.
        if (str1.length() != str2.length()) {
            return false;
        }

        // Iterate through each character in the strings
        for (int i = 0; i < str1.length(); i++) {
            // If any character at the same index is different, the strings are not equal.
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // If the loop completes without finding any differences, the strings are equal.
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input using the Scanner next() method for 2 String variables
        System.out.print("Enter the first string: ");
        String firstString = scanner.next();

        System.out.print("Enter the second string: ");
        String secondString = scanner.next();

        scanner.close();

        // b. Use the custom method to compare the strings and store the boolean result
        boolean customResult = customCompare(firstString, secondString);
        System.out.println("\nCustom comparison result (using charAt()): " + customResult);

        // c. Use the String Built-In method to check if the results are the same and display the result
        boolean builtInResult = firstString.equals(secondString);
        System.out.println("Built-in comparison result (using equals()): " + builtInResult);

        // Check if both methods produced the same boolean result
        if (customResult == builtInResult) {
            System.out.println("\nVerification successful: Both comparison methods produced the same result.");
        } else {
            System.out.println("\nVerification failed: The comparison methods produced different results.");
        }
    }
}
