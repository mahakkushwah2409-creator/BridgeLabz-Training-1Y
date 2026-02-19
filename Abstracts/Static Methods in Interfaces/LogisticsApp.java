// UnitConverter Interface
interface UnitConverter {

    // Length Conversion
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    // Weight Conversion
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}
public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 50;

        double miles = UnitConverter.kmToMiles(distanceKm);
        double pounds = UnitConverter.kgToLbs(weightKg);

        System.out.println(distanceKm + " km = " + miles + " miles");
        System.out.println(weightKg + " kg = " + pounds + " lbs");
    }
}
