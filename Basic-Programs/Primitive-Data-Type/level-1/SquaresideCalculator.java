import java.util.*;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");

        if (sc.hasNextDouble()) {
            double perimeter = sc.nextDouble();

            double side = perimeter / 4.0;

            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        } else {
            System.out.println("Invalid input. Please enter a numerical value for the perimeter.");
        }

        sc.close();
    }
}