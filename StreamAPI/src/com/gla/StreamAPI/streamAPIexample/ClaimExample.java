package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
import java.util.stream.*;
class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
public class ClaimExample {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Health", 8000),
                new Claim("Auto", 7000),
                new Claim("Auto", 6000)
        );
        Map<String, Double> result = claims.stream()
                .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                ));
        result.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}