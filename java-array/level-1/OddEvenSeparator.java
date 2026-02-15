import java.util.Scanner;
public class OddEvenSeparator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a natural number: ");
            int number = 0;

            // a. Get an integer input and check for a natural number (positive integer)
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number <= 0) {
                    System.err.println("Error: The number must be a natural number (a positive integer).");
                    scanner.close();
                    return; // Exit the program
                }
            } else {
                System.err.println("Error: Invalid input. Please enter an integer.");
                scanner.close();
                return; // Exit the program
            }
            scanner.close();

            // b. Create integer arrays for even and odd numbers with size = number / 2 + 1
            int[] oddNumbers = new int[number / 2 + 1];
            int[] evenNumbers = new int[number / 2 + 1];

            // c. Create index variables for odd and even numbers and initialize them to zero
            int oddIndex = 0;
            int evenIndex = 0;

            // d. Using a for loop, iterate from 1 to the number, saving into corresponding arrays
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex] = i;
                    evenIndex++;
                } else {
                    oddNumbers[oddIndex] = i;
                    oddIndex++;
                }
            }

            // e. Finally, print the odd and even numbers array using the odd and even index
            System.out.println("\nOdd Numbers Array:");
            // Iterate only up to the actual number of elements inserted (oddIndex)
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i] + (i == oddIndex - 1 ? "" : ", "));
            }
            System.out.println();

            System.out.println("\nEven Numbers Array:");
            // Iterate only up to the actual number of elements inserted (evenIndex)
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i] + (i == evenIndex - 1 ? "" : ", "));
            }
            System.out.println();
        }
    }