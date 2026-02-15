import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        // a. Get an integer input for the number variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        // Handle the special case for 0
        if (number == 0) {
            System.out.println("The number of digits in 0 is: 1");
            return;
        }

        // Work with a copy of the number so the original input is preserved
        int tempNumber = number;
        // b. Create an integer variable count with value 0
        int count = 0;

        // c. Use a loop to iterate until number is not equal to 0
        while (tempNumber != 0) {
            // d. Remove the last digit from number in each iteration (integer division)
            tempNumber /= 10;
            // e. Increase count by 1 in each iteration
            count++;
        }

        // f. Finally display the count to show the number of digits
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
