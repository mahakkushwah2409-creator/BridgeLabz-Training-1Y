import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {
        // Define a variable to take user input as a String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-numeric value to trigger the exception: ");
        String userInput = scanner.nextLine();
        
        System.out.println("\n--- Calling method to GENERATE the Exception (will crash the program) ---");
        // From the main, call the method to generate the Exception
        generateException(userInput);


        System.out.println("\n--- Calling method to HANDLE the Exception ---");
        // Call the method to handle the RuntimeException in java
        handleException(userInput);
        
        scanner.close();
    }

   
    public static void generateException(String text) {
        System.out.println("Attempting to parse \"" + text + "\" into an integer...");
        // Use Integer.parseInt(text) to extract number from the text
        int number = Integer.parseInt(text); // This is where the exception occurs
        System.out.println("Parsed number: " + number); // This line will not be reached if an exception occurs
    }

    /**
     * Method to demonstrate NumberFormatException handling using try-catch blocks.
     * This prevents the program from crashing.
     */
    public static void handleException(String text) {
        System.out.println("Attempting to parse \"" + text + "\" into an integer with error handling...");
        try {
            // Use Integer.parseInt(text) to extract number from the text
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Catch the specific NumberFormatException
            System.out.println("[NumberFormatException Handled] Error: The input \"" + text + "\" is not a valid number.");
            System.out.println("Exception message: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch a generic runtime exception (optional, demonstrates broader handling)
            System.out.println("[Generic RuntimeException Handled] An unexpected runtime error occurred.");
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            // The finally block always executes, regardless of whether an exception occurred
            System.out.println("[Finally Block Executed] Finished the handleException method.");
        }
    }
}
