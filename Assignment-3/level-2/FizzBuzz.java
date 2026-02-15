import java.util.Scanner; // Import the Scanner class to read input

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        int number;

        // Loop until a positive integer is entered
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) { // Check if the input is a valid integer
                number = scanner.nextInt();
                if (number > 0) { // Check if the integer is positive
                    break; // Exit the loop if a positive integer is found
                } else {
                    System.out.println("Please enter a positive number (greater than 0).");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Discard the invalid input to prevent an infinite loop
            }
        }

        scanner.close(); // Close the scanner after input is received

        System.out.println("FizzBuzz sequence up to " + number + ":");

        // Loop from 1 up to the user's number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // Check for multiples of both 3 and 5 first
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Check for multiples of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Check for multiples of 5
                System.out.println("Buzz");
            } else {
                System.out.println(i); // Print the number if none of the conditions are met
            }
        }
    }
}
