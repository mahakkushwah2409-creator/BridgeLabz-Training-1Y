public class EarthVolumeCalculator {
    public static void main(String[] args) {
        final double RADIUS_KM = 6378.0; 
        final double KM_TO_MILES = 0.621371; 

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(RADIUS_KM, 3);


        double radiusMiles = RADIUS_KM * KM_TO_MILES;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3 + ".");
    }
}