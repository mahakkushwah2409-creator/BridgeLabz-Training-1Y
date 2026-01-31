import java.util.*;

public class DistConvert{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");

        double distanceInFeet = sc.nextDouble();

        sc.close();

        double distanceInYards = distanceInFeet / 3.0;

        double distanceInMiles = distanceInFeet / 5280.0;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}