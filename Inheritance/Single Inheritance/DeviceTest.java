class Device {
    int deviceId;
    String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }
}

public class DeviceTest {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat(101, "ON", 24);
        t1.displayStatus();
    }
}
