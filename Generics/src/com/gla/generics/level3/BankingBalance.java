package com.gla.generics.level3;
import java.util.*;
public class BankingBalance {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("A1", 1000.0);
        map.put("A2", 5000.0);
        map.put("A3", 3000.0);
        map.put("A4", 8000.0);

        // Deposit
        map.put("A1", map.get("A1") + 500);

        // Withdraw
        if (map.get("A2") >= 2000) {
            map.put("A2", map.get("A2") - 2000);
        }

        // Sort descending
        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        // Top 3
        System.out.println("Top 3:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}
