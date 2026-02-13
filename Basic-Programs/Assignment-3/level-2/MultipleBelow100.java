import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Step a: Get input and validate
        while (true) {
            System.out.print("Enter a positive integer less than 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0 && number < 100) {
                    break; // Exit the loop if the input is valid
                } else {
                    System.out.println("Invalid input. Please enter a positive integer less than 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Multiples of " + number + " below 100:");

        // The hint suggests checking if `i` divides `number`, which would find *divisors*
        // The goal is to find *multiples* of `number` below 100.
        // We will adapt the logic to find multiples, using a standard forward loop as it is more efficient for this task.

        // Optimal implementation for finding multiples:
        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }

        /*
        // Implementation based *strictly* on the hint's backward loop logic (which finds divisors):
        // Note: This implementation does not find multiples of the input number.
        System.out.println("\nDivisors of " + number + " below 100 (as per hint logic):");
        for (int i = 100; i >= 1; i--) {
            // Step c: Check if 'i' perfectly divides the number (this finds divisors, not multiples)
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        */

        scanner.close();
    }
}
