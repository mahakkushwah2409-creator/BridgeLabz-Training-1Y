import java.util.Scanner;
public class FriendStats {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] names = {"Amar", "Akbar", "Anthony"};
            int[] ages = new int[3];
            double[] heights = new double[3];

            // a. Take user input for age and height for the 3 friends
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for " + names[i] + ":");
                System.out.print("Age: ");
                ages[i] = sc.nextInt();
                System.out.print("Height (in cm): ");
                heights[i] = sc.nextDouble();
            }

            // b. Loop through the array to find the youngest and tallest
            int youngestIdx = 0;
            int tallestIdx = 0;

            for (int i = 1; i < 3; i++) {
                if (ages[i] < ages[youngestIdx]) {
                    youngestIdx = i;
                }
                if (heights[i] > heights[tallestIdx]) {
                    tallestIdx = i;
                }
            }

            // c. Finally display the youngest and tallest
            System.out.println("\n--- Results ---");
            System.out.println("The youngest friend is: " + names[youngestIdx] + " (" + ages[youngestIdx] + " years old)");
            System.out.println("The tallest friend is: " + names[tallestIdx] + " (" + heights[tallestIdx] + " cm)");

            sc.close();
        }
    }