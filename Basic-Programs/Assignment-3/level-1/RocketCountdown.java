import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        // a. Create a variable counter to take user inputted value for the countdown.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to start the countdown: ");

        // Read the user input
        int counter = scanner.nextInt();
        
        // Ensure the countdown starts from a positive number
        if (counter <= 0) {
            System.out.println("Please enter a positive integer.");
            // Close the scanner and exit if input is invalid
            scanner.close(); 
            return;
        }

        System.out.println("Initiating rocket launch sequence...");

        // b. Use the while loop to check if the counter is 1
        // The condition runs as long as the counter is greater than or equal to 1.
        while (counter >= 1) {
            // c. Inside a while loop, print the value of the counter and decrement the counter.
            System.out.println(counter);
            counter--; // Decrement the counter by 1
        }
        
        System.out.println("Blast off!");
        
        // Close the scanner
        scanner.close();
    }
}
