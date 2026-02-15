import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // a. Get integer input for two variables named number and power.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power (exponent): ");
        int power = scanner.nextInt();

        scanner.close();

        // b. Create a result variable with an initial value of 1.
        long result = 1; // Use long to handle potentially large results

        // d. Create a temp variable counter and initialize to zero.
        int counter = 0;

        // Use the while loop till counter == power.
        while (counter < power) { // Loop while counter is less than power
            // c. In each iteration of the loop, multiply the result by the number and 
            //    assign the value to the result.
            result *= number; // Equivalent to: result = result * number;

            // Also, increment the counter.
            counter++;
        }

        // d. Finally, print the result in java using loops
        System.out.println(number + " to the power of " + power + " is: " + result);
    }
}
