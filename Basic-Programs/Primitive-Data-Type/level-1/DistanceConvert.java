 import java.util.*;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        sc.close();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("Distance in yards: " + yards + " yards");
        System.out.println("Distance in miles: " + miles + " miles");
    }
}