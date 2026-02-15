import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // a. Get the input value for a variable named number. Check the number is a
        // positive integer and less than 100.
        do {
            System.out.print("Enter a positive integer less than 100: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the non-integer input
                System.out.print("Enter a positive integer less than 100: ");
            }
            number = scanner.nextInt();
        } while (number <= 0 || number >= 100);

        System.out.println("Multiples of " + number + " below 100:");

        // Create a counter variable and assign counter = number;
        // Use a while till the counter is < 100
        int counter = number;
        while (counter < 100) {
            // Inside the loop, the current counter value is a multiple
            System.out.println(counter);
            
            // Increment the counter by the 'number' for the next multiple
            counter += number;
        }

        scanner.close();
    }
}
