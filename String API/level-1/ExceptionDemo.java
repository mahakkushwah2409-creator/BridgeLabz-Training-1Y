import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // Ensure string is long enough for demonstration
        if (userInput.length() < 5) {
            System.out.println("Please enter a string with at least 5 characters to run the demonstration.");
            return;
        }

        // d. Call the method to generate the Exception
        System.out.println("\n--- Demonstrating unhandled exception ---");
        try {
            generateException(userInput);
        } catch (Exception e) {
            // This catch block is just for structure; the method above would normally crash the program
            // if not run in a separate context as intended by the user prompt.
            System.out.println("The previous method call would have crashed the program without this outer try-catch block.");
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- Demonstrating handled exception ---");
        // d. Call the method to handle the RuntimeException
        handleException(userInput);

        scanner.close();
    }

    // b. Method to generate the Exception and abruptly stop the program
    // This method will throw an IllegalArgumentException if start > end.
    public static void generateException(String str) {
        System.out.println("Attempting to generate an exception...");
        // This will throw an IllegalArgumentException at runtime
        System.out.println("Result: " + str.substring(5, 2)); 
        System.out.println("This line will not be executed if an exception occurs.");
    }

    // c. Method to demonstrate IllegalArgumentException handling
    public static void handleException(String str) {
        System.out.println("Attempting to handle an exception with try-catch...");
        try {
            // Intentionally set start index > end index
            String sub = str.substring(5, 2); 
            System.out.println("Substring is: " + sub); // This won't run
        } catch (IllegalArgumentException e) {
            // Catch the specific IllegalArgumentException
            System.out.println("Caught the specific IllegalArgumentException:");
            System.out.println("Error message: " + e.getMessage());
        } catch (RuntimeException e) {
            // Catch any other general runtime exceptions if they occur
            System.out.println("Caught a generic RuntimeException:");
            System.out.println("Error message: " + e.getMessage());
        }
        System.out.println("Program continues execution after handling the exception.");
    }
}