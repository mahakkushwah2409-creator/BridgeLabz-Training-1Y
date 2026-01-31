import java.util.*;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();
        sc.close();

        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        final double SQ_INCH_TO_SQ_CM = 6.4516; 
        double areaInSquareCentimeters = areaInSquareInches * SQ_INCH_TO_SQ_CM;

        
        System.out.println("Area of the triangle in square inches: " + areaInSquareInches + " sq. inches");
        System.out.println("Area of the triangle in square centimeters: " + areaInSquareCentimeters + " sq. cm");
    }
}