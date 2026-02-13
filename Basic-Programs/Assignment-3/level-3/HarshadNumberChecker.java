import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        // b. Get an integer input for the number variable.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's a Harshad number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Store the original number for the final check and output.
        int originalNumber = number;

        // c. Create an integer variable sum with initial value 0.
        int sumOfDigits = 0;

        // Create a temporary variable to perform digit extraction without changing the original number yet.
        int tempNumber = number;

        // d. Create a while loop to access each digit of the number.
        while (tempNumber != 0) {
            // Get the last digit
            int digit = tempNumber % 10;
            // e. Inside the loop, add each digit of the number to sum.
            sumOfDigits += digit;
            // Remove the last digit
            tempNumber /= 10;
        }

        // Handle the case of 0 separately as the definition can be ambiguous for 0
        if (originalNumber == 0) {
            System.out.println(originalNumber + " is neither a Harshad number nor a non-Harshad number by standard definition.");
        } else {
            // f. Check if the number is perfectly divisible by the sum.
            // g. If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
            if (originalNumber % sumOfDigits == 0) {
                System.out.println(originalNumber + " is a Harshad Number.");
            } else {
                System.out.println(originalNumber + " is not a Harshad Number.");
            }
        }
    }
}
