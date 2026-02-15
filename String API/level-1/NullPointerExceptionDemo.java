public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        // Part 1: Call the method to generate the exception
        System.out.println("--- Demonstrating an intentional NullPointerException ---");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught the exception in main: " + e.getMessage());
            // It's generally better practice to handle the exception where it occurs
        }

        System.out.println("\n--- Demonstrating NullPointerException handling within a method ---");
        // Part 2: Refactor (or in this case, simply call) the method to handle the exception
        handleNullPointerException();
    }

    /**
     * Generates a NullPointerException by attempting to call a method on a null reference.
     */
    public static void generateNullPointerException() {
        String text = null; // Variable initialized to null
        System.out.println("Attempting to call a String method on a null variable...");
        // This next line generates the NullPointerException
        int length = text.length();
        System.out.println("Length of the string (this line won't execute): " + length);
    }

    /**
     * Demonstrates handling a NullPointerException using a try-catch block.
     */
    public static void handleNullPointerException() {
        String text = null; // Variable initialized to null

        try {
            System.out.println("Attempting to call a String method on a null variable within a try-catch block...");
            // This line generates the NullPointerException
            int length = text.length();
            System.out.println("Length of the string (this line won't execute): " + length);

        } catch (NullPointerException e) {
            // The catch block catches the exception and handles it gracefully
            System.out.println("Successfully handled the NullPointerException.");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Error details: Cannot invoke \"String.length()\" because \"text\" is null");
        }
        System.out.println("Execution continues after the try-catch block.");
    }
}
