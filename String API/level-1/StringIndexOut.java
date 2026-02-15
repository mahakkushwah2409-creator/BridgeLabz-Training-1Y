import java.util.Scanner;

public class StringIndexOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Define a variable of type String and take user input to assign a value
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        System.out.println("\n--- Demonstrating Unhandled Exception ---");
        try {
            generateException(userInput);
        } catch (Exception e) {
            // Catches the exception from the unhandled method call to allow the program to continue
            System.out.println("Caught the unhandled exception in main to allow program continuation: " + e.getMessage());
        }

        System.out.println("\n--- Demonstrating Handled Exception ---");
        handleException(userInput);

        scanner.close();
    }

    // b. Write a Method to generate the Exception
    // Access the index using charAt() beyond the length of the String
    public static void generateException(String str) {
        System.out.println("Attempting to access index beyond string length...");
        // This line will cause the StringIndexOutOfBoundsException
        char charAtIndex = str.charAt(str.length()); 
        System.out.println("This line will not be reached.");
    }

    // c. Write the Method to demonstrate StringIndexOutOfBoundsException with try-catch
    public static void handleException(String str) {
        System.out.println("Attempting to access index beyond string length using try-catch...");
        try {
            // Attempt to access an invalid index
            char charAtIndex = str.charAt(str.length()); 
            System.out.println("This line will not be reached.");
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the specific exception
            System.out.println("Caught the exception: String Index Out Of Bounds.");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("The program continues to run smoothly after handling the error.");
        }
    }
}