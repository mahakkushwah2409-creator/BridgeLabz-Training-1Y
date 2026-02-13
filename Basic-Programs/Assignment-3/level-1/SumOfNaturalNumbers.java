import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("Invalid input. 'n' must be a natural number (greater than 0).");
            return;
        }

        
        long sumWhileLoop = 0; 
        int counter = 1;

        while (counter <= n) {
            sumWhileLoop += counter;
            counter++;
        }

        long sumFormula = (long) n * (n + 1) / 2;

        System.out.println("\nCalculation Results:");
        System.out.println("Sum using while loop: " + sumWhileLoop);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFormula);

        System.out.println("\nComparison:");
        if (sumWhileLoop == sumFormula) {
            System.out.println("The result from both computations was correct. They match.");
        } else {
            System.out.println("Error: The results do not match.");
        }
    }
}
