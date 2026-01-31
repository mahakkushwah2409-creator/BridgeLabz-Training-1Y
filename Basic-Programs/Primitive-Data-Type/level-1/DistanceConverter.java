public class DistanceConverter {
    public static void main(String[] args) {
        // Define the conversion factor (miles per kilometer)
        final double MILES_PER_KM = 1.6;

        // The distance in kilometers
        double kilometers = 10.8;

        // Calculate the distance in miles
        double miles = kilometers * MILES_PER_KM;

        // Print the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}