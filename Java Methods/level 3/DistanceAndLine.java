import java.util.Scanner;

public class DistanceAndLine {

    // Method to find Euclidean distance
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find slope
    public static double findSlope(int x1, int y1, int x2, int y2) {
        return (double)(y2 - y1) / (x2 - x1);
    }

    // Method to find equation of line
    public static void findLineEquation(int x1, int y1, int x2, int y2) {
        double m = findSlope(x1, y1, x2, y2);
        double b = y1 - (m * x1);
        System.out.println("Equation of line: y = " + m + "x + " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Euclidean Distance: " + findDistance(x1, y1, x2, y2));
        findLineEquation(x1, y1, x2, y2);
    }
}
