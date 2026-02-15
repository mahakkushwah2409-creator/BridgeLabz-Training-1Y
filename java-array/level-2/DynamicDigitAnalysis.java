import java.util.Scanner;
import java.util.Arrays;
public class DynamicDigitAnalysis {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to analyze its digits: ");
            // Read the number as a string to easily access each digit
            String numberStr = scanner.nextLine();
            scanner.close();

            // Initial capacity for the digits array
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;

            // Hint f: Loop through each character of the input string and store it as an int
            for (int i = 0; i < numberStr.length(); i++) {
                // Check if the current array is full
                if (index == maxDigit) {
                    // Hint a & b: Increase the size of maxDigit and create a new temp array
                    int newMaxDigit = maxDigit + 10;
                    // Use Arrays.copyOf to simplify creating a new array and copying elements
                    int[] temp = Arrays.copyOf(digits, newMaxDigit);
                    digits = temp; // Assign the current digits array to the temp array
                    maxDigit = newMaxDigit; // Update the maxDigit variable
                    System.out.println("Array resized to capacity: " + maxDigit);
                }

                // Convert char to int and store in the array
                digits[index] = Character.getNumericValue(numberStr.charAt(i));
                index++;
            }

            // Now find the largest and second largest number in the populated array
            // Hint c: We use a separate method for clarity, passing the actual number of elements (index)
            findLargestAndSecondLargest(digits, index);
        }

        /**
         * Finds the largest and second largest elements in a given array.
         * This method runs in a single pass (O(n) time complexity).
         * @param arr The array of digits.
         * @param size The actual number of elements used in the array.
         */
        public static void findLargestAndSecondLargest(int[] arr, int size) {
            if (size < 2) {
                System.out.println("Not enough distinct digits to find the second largest.");
                return;
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("Largest digit: " + largest);
                System.out.println("No distinct second largest digit found (all elements may be equal).");
            } else {
                System.out.println("Largest digit: " + largest);
                System.out.println("Second largest digit: " + secondLargest);
            }
        }
    }