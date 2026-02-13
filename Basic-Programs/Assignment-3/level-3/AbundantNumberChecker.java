import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        // b. Get an integer input for the number variable.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Abundant Number: ");
        int number = scanner.nextInt();
        scanner.close();

        // c. Create an integer variable sum with initial value 0.
        int sum = 0;

        // d. Run a for loop from i = 1 to i < number.
        for (int i = 1; i < number; i++) {
            // e. Inside the loop, check if number is divisible by i.
            if (number % i == 0) {
                // f. If true, add i to sum.
                sum += i;
            }
        }

        // g. Outside the loop Check if sum is greater than number.
        // h. If the sum is greater than the number, print Abundant Number.
        //    Otherwise, print Not an Abundant Number.
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}
