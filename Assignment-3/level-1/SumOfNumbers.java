import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // a. Create a variable total of type double initialize to 0.0
        double total = 0.0;
        
        // Variable to store the double value the user enters
        double userInput;
        
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers to sum. Enter 0 to stop and display the total.");
        
        // b. Use the while loop to check if the user entered is 0
        // We read the first input before the loop starts
        userInput = scanner.nextDouble();

        while (userInput != 0) {
            // c. If the user entered value is not 0 then inside the while block add user entered value to the total
            total += userInput;
            
            // and ask the user to input again
            System.out.println("Enter next number (or 0 to finish):");
            userInput = scanner.nextDouble();
        }
        
        // Close the scanner
        scanner.close();
        
        // d. Outside the loop display the total value in java
        System.out.println("The total sum of the entered numbers is: " + total);
    }
}
