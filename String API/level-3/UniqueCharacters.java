import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUnique(String str) {

        int len = findLength(str);
        char[] temp = new char[len];  // maximum possible size
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {

            char current = str.charAt(i);
            boolean isUnique = true;

            // check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // create new array with exact unique size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUnique(input);

        System.out.println("Unique Characters are:");
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
    }
}