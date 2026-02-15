import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        // a. Get the input value for a variable named number and check if it is a positive integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number;

        // Input validation loop
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break; // Exit the validation loop if a valid positive integer is entered
                } else {
                    System.out.print("Please enter a positive integer: ");
                }
            } else {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        System.out.println("Factors of " + number + " are:");

        // b. Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number
        // is perfectly divisible by i. If true, print the value of i.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close(); // Close the scanner after use
    }
}
