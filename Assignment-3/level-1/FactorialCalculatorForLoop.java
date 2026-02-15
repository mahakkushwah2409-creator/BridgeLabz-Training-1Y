import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        // a. Take an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int number = scanner.nextInt();
        scanner.close();

        // b. Check if the user has entered a positive integer
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            // Initialize factorial to 1. Using long to handle larger factorials.
            long factorial = 1;

            // c. Compute the factorial using a for loop
            // The loop runs from 1 up to and including the number
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // d. Print the factorial at the end
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
