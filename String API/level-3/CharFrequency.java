import java.util.Scanner;

public class CharFrequency {

    /**
     * Finds the frequency of characters in a string using nested loops.
     *
     * @param text The input string.
     * @return A 1D string array where each element is a string formatted as "character: frequency".
     */
    public static String[] findCharacterFrequencies(String text) {
        // Convert the string to a character array for easier iteration and modification
        char[] charArray = text.toCharArray();
        int n = charArray.length;

        // An array to store the frequency of each character at the corresponding index
        int[] frequencyArray = new int[n];
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < n; i++) {
            // Initialize frequency of current character to 1
            frequencyArray[i] = 1;

            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < n; j++) {
                if (charArray[i] == charArray[j]) {
                    frequencyArray[i]++;
                    // Set duplicate characters to '0' (or any other marker) to avoid counting them again
                    charArray[j] = '0'; 
                }
            }
        }

        // Count how many unique characters there are to size the result array correctly
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (charArray[i] != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store the final characters and their frequencies
        String[] resultArray = new String[uniqueCount];
        int resultIndex = 0;

        // Iterate through the modified charArray and frequencyArray to populate the resultArray
        for (int i = 0; i < n; i++) {
            // Only add to result if it's not a '0' marker (meaning it's the first occurrence of a unique character)
            if (charArray[i] != '0') {
                resultArray[resultIndex] = charArray[i] + ": " + frequencyArray[i];
                resultIndex++;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to find character frequencies:");
        String userInput = scanner.nextLine();
        scanner.close();

        // Call the method to get the character frequencies
        String[] frequencies = findCharacterFrequencies(userInput);

        // Display the results
        System.out.println("Character frequencies:");
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }
}
