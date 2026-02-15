import java.util.Scanner;
import java.util.Arrays;

public class CharacterArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.next();
        scanner.close();

        // a. Take user input using the Scanner next() method
        // The user input is stored in the `userInput` variable.

        // d. In the main() call the user-defined method and the String built-in toCharArray() method
        char[] customArray = stringToCharArrayCustom(userInput);
        char[] builtInArray = userInput.toCharArray();

        // compare the 2 arrays
        boolean isEqual = compareCharArrays(customArray, builtInArray);

        // and finally display the result
        System.out.println("\nOriginal String: \"" + userInput + "\"");
        System.out.println("Custom Method Result: " + Arrays.toString(customArray));
        System.out.println("Built-in Method Result: " + Arrays.toString(builtInArray));
        System.out.println("Arrays are equal: " + isEqual);
    }

    // b. Write a method to return the characters in a string without using the toCharArray()
    /**
     * Converts a string to a character array manually.
     * @param str The input string.
     * @return A character array containing all characters from the string.
     */
    public static char[] stringToCharArrayCustom(String str) {
        // Create a new char array with the same length as the string
        char[] charArray = new char[str.length()];

        // Iterate through the string and copy each character to the array
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }

    // c. Write a method to compare two string arrays and return a boolean result
    /**
     * Compares two character arrays for equality.
     * @param arr1 The first character array.
     * @param arr2 The second character array.
     * @return true if the arrays are equal (same length and elements), false otherwise.
     */
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        // First, check if the lengths are the same
        if (arr1.length != arr2.length) {
            return false;
        }

        // Then, check each element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        // If all checks pass, the arrays are equal
        return true;
    }
}
