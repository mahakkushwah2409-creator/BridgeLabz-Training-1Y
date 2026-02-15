import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String str) {
        int count = 0;
        try {
            // Iterate through characters until an exception is thrown
            while (true) {
                // Accessing character at the current index
                // This will throw an IndexOutOfBoundsException when count reaches the string length
                char c = str.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception and return the final count
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input using the Scanner next() method
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        
        scanner.close();

        // c. The main function calls the user-defined method
        int customLength = findLength(inputString);
        System.out.println("Length calculated without length() method: " + customLength);

        // c. as well as the built-in length() method and displays the result
        int builtInLength = inputString.length();
        System.out.println("Length calculated using built-in length() method: " + builtInLength);

        // Verify both methods return the same result
        if (customLength == builtInLength) {
            System.out.println("Both methods returned the same length.");
        } else {
            System.out.println("There was an error in length calculation.");
        }
    }
}