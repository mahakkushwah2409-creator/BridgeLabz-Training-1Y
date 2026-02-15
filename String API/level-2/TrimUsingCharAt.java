import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        // Remove leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces:");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);

        String trimmedByMethod = "";
        if (indexes[0] <= indexes[1]) {
            trimmedByMethod = createSubstring(input, indexes[0], indexes[1]);
        }

        // Using built-in trim()
        String trimmedByBuiltin = input.trim();

        // Compare both strings
        boolean isSame = compareStrings(trimmedByMethod, trimmedByBuiltin);

        System.out.println("Trimmed (charAt method): \"" + trimmedByMethod + "\"");
        System.out.println("Trimmed (built-in trim): \"" + trimmedByBuiltin + "\"");
        System.out.println("Are both equal? " + isSame);
    }
}