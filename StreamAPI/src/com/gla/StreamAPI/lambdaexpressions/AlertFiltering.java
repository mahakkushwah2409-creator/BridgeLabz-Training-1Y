package com.gla.StreamAPI.lambdaexpressions;
import java.util.*;
import java.util.function.*;
class Alert {
    String message;
    String type;
    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
    public String toString() {
        return type + ": " + message;
    }
}
public class AlertFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("High BP", "CRITICAL"),
                new Alert("Normal Checkup", "INFO"),
                new Alert("Low Sugar", "CRITICAL")
        );
        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");
        alerts.stream()
                .filter(criticalOnly)
                .forEach(System.out::println);
    }
}