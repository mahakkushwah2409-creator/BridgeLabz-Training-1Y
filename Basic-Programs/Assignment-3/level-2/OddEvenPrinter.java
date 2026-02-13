import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        // a. Get an integer input from the user, assign to a variable number and check for Natural Number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number;

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number < 1) {
                System.out.println("Invalid input. Please enter a natural number (a positive integer >= 1).");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        // b. Using a for loop, iterate from 1 to the number
        System.out.println("\n--- Results from 1 to " + number + " ---");
        for (int i = 1; i <= number; i++) {
            // c. In each iteration of the loop, print the number is odd or even number in java
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
        
        scanner.close();
    }
}
