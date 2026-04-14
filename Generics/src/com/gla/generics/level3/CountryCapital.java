package com.gla.generics.level3;
import java.util.*;
public class CountryCapital {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        // Add 8 countries
        map.put("India", "New Delhi");
        map.put("USA", "Washington");
        map.put("UK", "London");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");
        map.put("Germany", "Berlin");
        map.put("Canada", "Ottawa");
        map.put("Italy", "Rome");

        // Lookup
        String country = "India";
        System.out.println(map.getOrDefault(country, "Unknown country"));

        // Print sorted
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}