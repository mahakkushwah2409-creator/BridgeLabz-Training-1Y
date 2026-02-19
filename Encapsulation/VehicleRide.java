abstract class VehicleRide {
    protected double ratePerKm;

    abstract double calculateFare(double distance);

    void getVehicleDetails() {
        System.out.println("Rate per km: " + ratePerKm);
    }
}

interface GPS {
    void getCurrentLocation();
    void updateLocation();
}

class Auto extends VehicleRide implements GPS {
    public Auto() {
        ratePerKm = 15;
    }

    double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public void getCurrentLocation() {
        System.out.println("Fetching location...");
    }

    public void updateLocation() {
        System.out.println("Location updated");
    }
}
