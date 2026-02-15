import java.util.Scanner;
public class TeamMeanHeight {

        public static void main(String[] args) {
            // b. Create a double array named heights of size 11
            double[] heights = new double[11];
            Scanner scanner = new Scanner(System.in);
            double sum = 0.0;
            int numPlayers = heights.length; // Number of elements (11)

            System.out.println("Enter the heights of the 11 football players in meters (e.g., 1.85):");

            // Get input values from the user and find the sum
            for (int i = 0; i < numPlayers; i++) {
                System.out.print("Height of player " + (i + 1) + ": ");
                // Validate input might be added here for a robust program
                if (scanner.hasNextDouble()) {
                    heights[i] = scanner.nextDouble();
                    // c. Find the sum of all the elements present in the array
                    sum += heights[i];
                } else {
                    System.out.println("Invalid input. Please enter a numerical value.");
                    scanner.next(); // Clear the invalid input
                    i--; // Decrement i to re-prompt for the same player
                }
            }

            scanner.close();

            // a. The formula to calculate the mean is: mean = sum of all elements / number of elements
            // d. Divide the sum by 11 to find the mean height
            double meanHeight = sum / numPlayers;

            // Print the mean height of the football team
            System.out.println("\n----------------------------------");
            System.out.println("Total sum of heights: " + sum + " meters");
            System.out.println("Number of players: " + numPlayers);
            System.out.printf("The mean height of the football team is: %.2f meters\n", meanHeight);
            System.out.println("----------------------------------");
        }
    }