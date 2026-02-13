import java.util.Scanner;

public class GreatestFactorWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        // a. Define greatestFactor and initialize to 1
        int greatestFactor = 1;
        
        // b. Create a counter starting from number - 1
        int counter = number - 1;
        
        // b. Use while loop (while counter >= 1)
        while (counter >= 1) {
            // e. Check if number is perfectly divisible by counter
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Break the loop at the first (largest) factor found
            }
            counter--; // Decrement counter to check next lower number
        }
        
        // f. Display the result
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        
        sc.close();
    }
}
