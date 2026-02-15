import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        // b. Get an integer input and store it in the number variable and define sum variable, 
        //    initialize it to zero and originalNumber variable and assign it to input number variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int sum = 0;
        
        // c. Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // d. In the while loop find each digit which is the reminder of the modulus operation number % 10. 
            //    Find the cube of the number and add it to the sum variable
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3); // Use Math.pow for the cube, type cast might be needed for very large numbers

            // e. Again in while loop find the quotient of the number using the division operation number/10 
            //    and assign it to the original number. This removes the last digit of the original number.
            originalNumber /= 10;
        }

        // f. Finally check if the number and the sum are the same, if same its an Armstrong number else not. So display accordingly
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
