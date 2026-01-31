public class DistanceCalculator {
    public static void main(String[] args) {
        final double MILES_PER_KM = 1.6;

        double kilometers = 10.8;

        double miles = kilometers * MILES_PER_KM;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}