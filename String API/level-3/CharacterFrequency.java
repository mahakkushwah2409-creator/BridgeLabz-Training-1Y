import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters
    public static String[][] findFrequency(String str) {

        int[] freq = new int[256];  // ASCII array

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] != 0) {
                count++;
                freq[str.charAt(i)] = 0; // avoid duplicate counting
            }
        }

        // Recalculate frequency again (since we modified freq)
        freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 3: Store characters and frequencies
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; // avoid duplicate storing
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] data = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("-------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}