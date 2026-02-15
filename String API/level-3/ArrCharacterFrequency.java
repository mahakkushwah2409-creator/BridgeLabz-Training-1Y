import java.util.Scanner;

public class ArrCharacterFrequency {

    // Method to find unique characters in a string using charAt()
    public static char[] uniqueCharacters(String text) {
        String uniqueCharsStr = "";
        // Nested loops to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCharsStr.length(); j++) {
                if (currentChar == uniqueCharsStr.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharsStr += currentChar;
            }
        }
        return uniqueCharsStr.toCharArray();
    }

    // Method to find the frequency of characters and return a 2D array
    public static String[][] characterFrequencies(String text) {
        // i. Create an array to store the frequency of characters using ASCII values as indexes
        int[] frequencies = new int[256]; // 256 ASCII characters

        // ii. Loop through the text to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequencies[(int) currentChar]++;
        }

        // iii. Call the uniqueCharacters() method to find the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // iv. Create a 2D String array to store the unique characters and their frequencies
        String[][] frequencyArray = new String[uniqueChars.length][2];

        // v. Loop through the unique characters and store the characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = frequencies[(int) currentChar];
            frequencyArray[i][0] = String.valueOf(currentChar);
            frequencyArray[i][1] = String.valueOf(frequency);
        }

        return frequencyArray;
    }

    // Main function to take user input, call methods, and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        scanner.close();

        // Call the characterFrequencies method
        String[][] results = characterFrequencies(inputString);

        // Display the results
        System.out.println("\nCharacter Frequencies:");
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-9s | %-9s%n", results[i][0], results[i][1]);
        }
    }
}
