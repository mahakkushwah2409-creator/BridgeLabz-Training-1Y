import java.util.Scanner;
import java.util.Arrays;
public class ArrayReverseNumber {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // a. Take user input for a number.
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            // Work with a copy to avoid modifying the original input number for digit extraction
            int tempNumber = number;

            // b. Find the count of digits in the number.
            int digitCount = String.valueOf(number).length();
            System.out.println("Number of digits: " + digitCount);

            // c. Find the digits in the number and save them in an array
            // We can create and fill a single array to meet the requirement.
            int[] digitsArray = new int[digitCount];
            int index = digitCount - 1; // Start filling from the end of the array

            while (tempNumber != 0) {
                int lastDigit = tempNumber % 10;
                digitsArray[index] = lastDigit;
                tempNumber /= 10;
                index--;
            }

            System.out.println("Original digits array: " + Arrays.toString(digitsArray));

            // d. Create an array to store the elements of the digits array in reverse order
            // e. Finally, display the elements of the array in reverse order in java Arrays

            // A dedicated 'reversed array' is not strictly necessary if we simply iterate the original array backwards.
            // If you must create a *second* array:
            int[] reversedArray = new int[digitCount];
            for (int i = 0; i < digitCount; i++) {
                reversedArray[i] = digitsArray[digitCount - 1 - i];
            }

            System.out.println("Reversed digits array: " + Arrays.toString(reversedArray));
            System.out.print("Reversed number (as array elements): ");

            // Displaying the reversed array elements without commas
            for (int i = 0; i < digitCount; i++) {
                System.out.print(reversedArray[i]);
            }
            System.out.println(); // Newline at the end
        }
    }