import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        // a. Take user input and check if it's a natural number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (natural number): ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a natural number (positive integer).");
            return;
        }

        // b. Compute using the for loop
        long sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }

        // b. Compute using the formula
        // The formula for the sum of the first n natural numbers is n * (n + 1) / 2
        long sumFormula = (long) n * (n + 1) / 2; // Cast to long to prevent potential overflow for large n

        // c. Compare the two results and print
        System.out.println("\nResults:");
        System.out.println("*   Sum using for loop: " + sumForLoop);
        System.out.println("*   Sum using formula: " + sumFormula);

        if (sumForLoop == sumFormula) {
            System.out.println("The results from both methods match.");
        } else {
            System.out.println("The results do not match. There might be an error.");
        }
    }
}
