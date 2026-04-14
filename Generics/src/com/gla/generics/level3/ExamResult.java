package com.gla.generics.level3;
import java.util.*;
public class ExamResult {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        // Add data
        data.put("Math", new HashMap<>());
        data.get("Math").put("Aman", 95);
        data.get("Math").put("Riya", 85);

        data.put("Science", new HashMap<>());
        data.get("Science").put("Aman", 88);
        data.get("Science").put("Riya", 92);

        // Topper per subject
        for (String subject : data.keySet()) {
            Map<String, Integer> m = data.get(subject);

            String top = null;
            int max = 0;

            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    top = e.getKey();
                }
            }

            System.out.println(subject + " Topper: " + top);
        }

        // Average per subject
        for (String subject : data.keySet()) {
            int sum = 0;
            for (int v : data.get(subject).values()) sum += v;
            System.out.println(subject + " Avg: " + sum / data.get(subject).size());
        }

        // Above 90
        System.out.println("Subjects with score > 90:");
        for (String subject : data.keySet()) {
            for (int v : data.get(subject).values()) {
                if (v > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}
