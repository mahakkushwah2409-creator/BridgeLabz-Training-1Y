import java.util.Scanner; // Import the Scanner class to read input

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare variables for salary, years of service, and bonus
        double salary;
        int yearsOfService;
        double bonusAmount = 0.0;
        final double BONUS_RATE = 0.05; // 5% bonus rate

        // Take salary as input
        System.out.print("Enter the employee's annual salary: ");
        salary = scanner.nextDouble(); // Read the salary as a double

        // Take years of service as input
        System.out.print("Enter the employee's years of service: ");
        yearsOfService = scanner.nextInt(); // Read the years of service as an integer

        // Check if the employee is eligible for a bonus based on years of service
        if (yearsOfService > 5) {
            bonusAmount = salary * BONUS_RATE; // Calculate 5% bonus
            System.out.println("The employee is eligible for a bonus.");
        } else {
            System.out.println("The employee is not eligible for a bonus (service is 5 years or less).");
        }

        // Print the calculated bonus amount
        System.out.println("The bonus amount is: $" + bonusAmount);
        
        // Close the scanner to free up resources
        scanner.close();
    }
}
