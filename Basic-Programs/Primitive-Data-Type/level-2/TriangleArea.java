import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base in cm: ");
        double base_cm = sc.nextDouble();
        System.out.print("Enter the height in cm: ");
        double height_cm = sc.nextDouble();

        // Calculate area in square centimeters
        double area_sq_cm = 0.5 * base_cm * height_cm;

        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq in = 6.4516 sq cm)
        double area_sq_in = area_sq_cm / (2.54 * 2.54);

        // Output the results
        System.out.println("The Area of the triangle in sq in is " + area_sq_in + " and sq cm is " + area_sq_cm);

        sc.close();
    }
}