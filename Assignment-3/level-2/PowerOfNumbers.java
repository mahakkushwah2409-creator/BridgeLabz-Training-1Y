import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, power;
        long result = 1; // Use 'long' to handle potentially large results
        
        // 1. Get integer input for two variables and check for positive integer for power
        while (true) {
            System.out.print("Enter the base number: ");
            if (scanner.hasNextInt()) {
                base = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input for the base number. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        while (true) {
            System.out.print("Enter the positive integer power (exponent): ");
            if (scanner.hasNextInt()) {
                power = scanner.nextInt();
                if (power >= 0) { // Check if the power is a positive integer or zero
                    break;
                } else {
                    System.out.println("Please enter a positive integer or zero for the power.");
                }
            } else {
                System.out.println("Invalid input for the power. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        scanner.close(); // Close the scanner after input is done

        // 2. Create a result variable with an initial value of 1 (already done above)
        
        // 3. Run a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= base; // Multiply the result by the number in each iteration
        }
        
        // Finally, print the result
        System.out.println(base + " raised to the power of " + power + " is: " + result);
    }
}
