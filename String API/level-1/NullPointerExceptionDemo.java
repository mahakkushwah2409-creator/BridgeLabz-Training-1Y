public class NullPointerExceptionDemo {

    public static void main(String[] args) {
 
        System.out.println("--- Demonstrating an intentional NullPointerException ---");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught the exception in main: " + e.getMessage());
        }

        System.out.println("\n--- Demonstrating NullPointerException handling within a method ---");
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null; // Variable initialized to null
        System.out.println("Attempting to call a String method on a null variable...");
        int length = text.length();
        System.out.println("Length of the string (this line won't execute): " + length);
    }

   
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
