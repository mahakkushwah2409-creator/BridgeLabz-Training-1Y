import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String str) {

        int[] freq = new int[256]; // ASCII array

        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;   // ASCII value used as index
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // if no non-repeating character found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result != '\0')
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
