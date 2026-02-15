import java.util.Scanner;

public class SubstringCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input for the original string, start index, and end index
        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // b. Create a substring using the custom charAt method
        String subByCharAt = createSubstringWithCharAt(mainString, startIndex, endIndex);
        System.out.println("Substring using charAt(): " + subByCharAt);

        // d. Use the String built-in method substring()
        String subByBuiltIn = mainString.substring(startIndex, endIndex);
        System.out.println("Substring using substring(): " + subByBuiltIn);

        // c & d. Compare the two strings and display the results
        System.out.println("\nComparing the two substrings:");
        boolean areEqualByCharAt = compareStringsWithCharAt(subByCharAt, subByBuiltIn);
        boolean areEqualByEquals = subByCharAt.equals(subByBuiltIn);

        System.out.println("Comparison result using custom charAt() method: " + areEqualByCharAt);
        System.out.println("Comparison result using built-in equals() method: " + areEqualByEquals);
        
        scanner.close();
    }

    /**
     * Creates a substring from a string using the charAt() method.
     * Checks for invalid start/end indices or if start > end.
     */
    public static String createSubstringWithCharAt(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            System.err.println("Error: Invalid start or end index.");
            return ""; // Return an empty string in case of error
        }

        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    /**
     * Compares two strings character by character using the charAt() method.
     */
    public static boolean compareStringsWithCharAt(String str1, String str2) {
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
}
