import java.util.Scanner;

public class ArrayExceptionDemo {

    public static String[] getInputArray(Scanner scanner) {
        System.out.print("Enter the number of names you want to store: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");

        for (int i = 0; i < size; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        return names;
    }

    public static void generateException(String[] names) {
        System.out.println("\n--- Method 1: Generating Unhandled Exception ---");
        System.out.println("Attempting to access index " + names.length + " in an array of size " + names.length);
        String name = names[names.length]; 
        System.out.println("This line will not be executed.");
    }

    public static void handleException(String[] names) {
        System.out.println("\n--- Method 2: Handling Exception with try-catch ---");
        int invalidIndex = names.length;

        try {
            System.out.println("Attempting to access invalid index: " + invalidIndex);
            String name = names[invalidIndex];
            System.out.println("Accessed name: " + name); // This line is skipped if exception occurs
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the specific exception type
            System.out.println("Caught the specific exception: " + e.getMessage());
            System.out.println("Error: The index " + invalidIndex + " is out of bounds for an array of length " + names.length);
        } catch (RuntimeException e) {
            // Catch a more generic runtime exception (optional, demonstrates broader handling)
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        } finally {
            // The finally block executes regardless of whether an exception occurred or was caught
            System.out.println("Inside the finally block: Cleanup finished.");
        }
        System.out.println("The program continues to run normally after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = getInputArray(scanner);

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nMain method caught the unhandled exception from generateException method to allow program continuation.");
            System.out.println("Exception details: " + e.getMessage());
        }
        
        handleException(names);

        scanner.close();
    }
}
