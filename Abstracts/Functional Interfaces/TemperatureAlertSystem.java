boolean test(T t);
import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 35.0;   // Temperature limit

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemperature = 38.5;

        if (isHighTemperature.test(currentTemperature)) {
            System.out.println(" ALERT! Temperature crossed the threshold.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
