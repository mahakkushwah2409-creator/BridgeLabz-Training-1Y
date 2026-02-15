
    import java.util.Scanner;

    public class ArrayNumberSummer {
        public static void main(String[] args) {
            // a. Create necessary variables
            Scanner scanner = new Scanner(System.in);
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;

            System.out.println("Enter up to 10 positive numbers (enter 0 or a negative number to stop):");

            // b. Use infinite while loop
            while (true) {
                System.out.print("Enter number: ");
                double userEntry = scanner.nextDouble();

                // c. Check if the user entered 0 or a negative number to break the loop
                if (userEntry <= 0) {
                    System.out.println("Zero or negative number entered. Stopping input.");
                    break;
                }

                // e. If valid, assign the number to the array element and increment the index
                numbers[index] = userEntry;
                index++;

                // d. Also, break from the loop if the index has a value of 10
                if (index >= 10) {
                    System.out.println("Maximum numbers (10) reached. Stopping input.");
                    break;
                }
            }

            scanner.close();

            System.out.println("\n--- Results ---");
            System.out.println("Numbers entered:");

            // f. Take another for loop to get the values of each element and add it to the total
            // We only iterate up to the current value of the 'index' variable,
            // which tracks how many numbers were actually stored.
            for (int i = 0; i < index; i++) {
                System.out.println(numbers[i]);
                total += numbers[i];
            }

            // g. Finally display the total value
            System.out.println("The sum of all numbers is: " + total);
        }
    }