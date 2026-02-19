// VehicleDashboard Interface
interface VehicleDashboard {

    void displaySpeed(int speed);

    // New feature added later
    default void displayBatteryStatus(int batteryPercentage) {
        System.out.println("Battery status not available for this vehicle.");
    }
}
class PetrolCar implements VehicleDashboard {

    public void displaySpeed(int speed) {
        System.out.println("Petrol Car Speed: " + speed + " km/h");
    }
}
public class SmartDashboardApp {

    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed(80);
        petrol.displayBatteryStatus(0);  // Uses default method

        electric.displaySpeed(60);
        electric.displayBatteryStatus(85);  // Uses overridden method
    }
}
