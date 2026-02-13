import java.util.Scanner;

public class FactorFinderWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter = 1;

        // a. Get the input value and check if it is a positive integer.
        do {
            System.out.print("Enter a positive integer: ");
            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                input.next(); // Consume the invalid input
            }
            number = input.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (number <= 0); // Keep asking until a positive integer is entered

        System.out.println("Factors of " + number + " are: ");

        // b. Create a counter variable and run the while loop
        while (counter <= number) {
            // In each iteration of the loop, check if the number is perfectly divisible by the counter.
            if (number % counter == 0) {
                // If true, print the value of the counter.
                System.out.print(counter + " ");
            }
            counter++; // Increment the counter
        }

        input.close();
    }
}
