package wrapperClasses;
import java.util.ArrayList;

    public class SensorDataLogger {

        public static void logTemperature(Double temp, ArrayList<Double> storage) {
            if (temp == null) {
                System.out.println("Invalid reading (null), skipped.");
                return;
            }

            storage.add(temp);
        }

        public static void main(String[] args) {

            ArrayList<Double> sensorData = new ArrayList<>();

            // Primitive values (auto-boxing happens here)
            double t1 = 25.5;
            double t2 = 30.0;

            logTemperature(t1, sensorData); // double → Double
            logTemperature(t2, sensorData);

            // Wrapper object
            Double t3 = 28.7;
            logTemperature(t3, sensorData);

            // Null value (invalid sensor reading)
            Double t4 = null;
            logTemperature(t4, sensorData);

            // Reading values (auto-unboxing happens here)
            double sum = 0;
            for (Double temp : sensorData) {
                sum += temp; // Double → double
            }

            double average = sum / sensorData.size();

            // Output
            System.out.println("Stored Sensor Data: " + sensorData);
            System.out.println("Average Temperature: " + average);
        }
    }


