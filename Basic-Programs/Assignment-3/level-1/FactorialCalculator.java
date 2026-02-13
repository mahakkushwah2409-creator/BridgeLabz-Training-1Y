import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        int number;
        long factorial = 1;
        int i = 1;

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        
        // Ensure the input is a valid integer
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            // Check if the number is positive
            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                // Compute the factorial using a while loop
                while (i <= number) {
                    factorial *= i; // Equivalent to factorial = factorial * i;
                    i++;
                }
                // Print the final result
                System.out.println("The factorial of " + number + " is " + factorial);
            }
        } else {
            System.out.println("Error: Invalid input. Please enter an integer.");
        }

        // Close the scanner
        scanner.close();
    }
}
