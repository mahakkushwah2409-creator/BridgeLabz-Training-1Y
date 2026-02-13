import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // a. Take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // b. Find the youngest friend
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // c. Find the tallest friend
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        System.out.println("Youngest friend is: " + youngest + " (" + minAge + " years old)");
        System.out.println("Tallest friend is: " + tallest + " (" + maxHeight + " cm)");
        
        sc.close();
    }
}
