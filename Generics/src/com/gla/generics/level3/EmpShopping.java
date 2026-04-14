package com.gla.generics.level3;
import java.util.*;
public class EmpShopping {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "HR");
        map.put(2, "IT");
        map.put(3, "HR");
        map.put(4, "Finance");

        // Update
        map.put(2, "HR");

        // Reverse lookup
        System.out.println("Employees in HR:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            if (e.getValue().equals("HR")) {
                System.out.println(e.getKey());
            }
        }

        // Count per dept
        Map<String, Integer> count = new HashMap<>();
        for (String dept : map.values()) {
            count.put(dept, count.getOrDefault(dept, 0) + 1);
        }

        System.out.println(count);
    }
}
