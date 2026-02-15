import java.util.Scanner;

public class StringSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a. Take user input using nextLine()
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // e. Call user-defined method
        String[] customSplitResult = customSplit(input);
        
        // e. Call built-in split() method
        String[] builtInSplitResult = input.split(" ");

        // Display results
        System.out.println("\n--- Results ---");
        System.out.print("Custom Split: ");
        printArray(customSplitResult);
        
        System.out.print("Built-in Split: ");
        printArray(builtInSplitResult);

        // d/e. Compare results and display
        boolean isEqual = compareArrays(customSplitResult, builtInSplitResult);
        System.out.println("Are both arrays equal? " + isEqual);
        
        sc.close();
    }

    // b. Find length without using length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // c. Split text using charAt() and specified logic
    public static String[] customSplit(String str) {
        int len = findLength(str);
        if (len == 0) return new String[0];

        // i. Count words and store space indexes
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1; // Virtual space before start
        int indexRef = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[indexRef++] = i;
            }
        }
        spaceIndexes[wordCount] = len; // Virtual space after end

        // ii. Create array to store words and extract them
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    // d. Compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    // Helper to display arrays
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}