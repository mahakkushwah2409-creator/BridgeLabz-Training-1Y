package com.gla.generics.level3;
import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("Aman", 50000.0);
        map.put("Riya", 60000.0);
        map.put("John", 55000.0);
        map.put("Neha", 70000.0);
        map.put("Sam", 70000.0);
        map.put("Raj", 45000.0);

        // Raise
        String emp = "Aman";
        if (map.containsKey(emp)) {
            map.put(emp, map.get(emp) * 1.10);
        }

        // Average
        double sum = 0;
        for (double v : map.values()) sum += v;
        System.out.println("Average: " + sum / map.size());

        // Highest
        double max = Collections.max(map.values());
        System.out.println("Highest Paid:");
        for (String k : map.keySet()) {
            if (map.get(k) == max) System.out.println(k);
        }
    }
}