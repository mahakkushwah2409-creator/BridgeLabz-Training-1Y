import java.util.Scanner;

public class WordLengthProgram {

    // Method to split text into words using charAt()
    public static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; 
        return words;
    }

    // Method to find string length without using length()
    public static int findLength(String str) {
        int len = 0;
        for (char c : str.toCharArray()) {
            len++;
        }
        return len;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word index
    public static int[] findShortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(Strin
