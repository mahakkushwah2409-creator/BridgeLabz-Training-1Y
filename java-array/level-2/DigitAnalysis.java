import java.util.Scanner;

public class DigitAnalysis {

        public static void main(String[] args) {
            // a. Create a number variable and take user input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            // b. Define an array and set maxDigit to 10
            int maxDigit = 10;
            int[] digits = new int[maxDigit];

            // c. Create an integer variable index
            int index = 0;

            // d & e. Iterate until number is 0 and remove last digit
            // Note: Using Math.abs to handle negative inputs
            long tempNumber = Math.abs(number);

            while (tempNumber != 0) {
                int lastDigit = (int) (tempNumber % 10);
                digits[index] = lastDigit;

                // f. Increment index and break if equals maxDigit
                index++;
                if (index == maxDigit) {
                    break;
                }
                tempNumber /= 10;
            }

            // g. Define variables for largest and second largest
            int largest = 0;
            int secondLargest = 0;

            // h. Loop through the array to find the values
            // We only loop up to 'index' since that's how many digits were stored
            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }

            // i. Display results
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);

            sc.close();
        }
    }