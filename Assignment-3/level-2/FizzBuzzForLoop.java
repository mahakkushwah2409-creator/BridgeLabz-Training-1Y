import java.util.Scanner;

public class FizzBuzzForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        // Take user input number and check for a positive integer
        while (!isValid) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                if (userInput > 0) {
                    number = userInput;
                    isValid = true;
                } else {
                    System.out.println("Invalid input. Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();

        // Loop and print the FizzBuzz sequence using a for loop
        System.out.println("\nFizzBuzz sequence up to " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
