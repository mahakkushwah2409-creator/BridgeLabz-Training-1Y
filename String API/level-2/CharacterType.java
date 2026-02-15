import java.util.Scanner;

public class CharacterType {

    // Method to check character type
    public static String checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if alphabet
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

    // Method to create 2D array of character and its type
    public static String[][] findCharacters(String str) {

        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length()