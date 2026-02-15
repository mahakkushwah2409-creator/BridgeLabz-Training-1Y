import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // a. Get an integer input and assign it to the number variable.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Define a greatestFactor variable and assign it to 1
        int greatestFactor = 1;

        // b. Create a for loop that runs from last but one till 1
        //    (i = number - 1 to i = 1)
        for (int i = number - 1; i >= 1; i--) {
            // c. Inside the loop, check if the number is perfectly divisible by i
            if (number % i == 0) {
                // then assign i to greatestFactor variable and break the loop.
                greatestFactor = i;
                break; // Exit the loop as the first factor found this way is the greatest
            }
        }

        // d. Display the greatestFactor variable outside the loop
        System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
    }
}
