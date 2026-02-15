import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        // d. Use the isPrime boolean variable to store the result
        boolean isPrime = true;

        // b. Prime Numbers checks are done for numbers greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // c. Loop through numbers from 2 up to the user input number
            // (Note: To check if a number is prime, we check up to its half or square root)
            for (int i = 2; i <= num / 2; i++) {
                // Check if the reminder is zero
                if (num % i == 0) {
                    isPrime = false;
                    // Break out from the loop if divisible by another number
                    break;
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        
        input.close();
    }
}
