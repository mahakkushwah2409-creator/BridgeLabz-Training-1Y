package com.gla.generics.level3;
import java.util.*;
public class WebsiteVisit {
    public static void main(String[] args) {
        String[] visits = {"home","about","products","home","products","contact","home"};

        Map<String, Integer> map = new HashMap<>();

        for (String v : visits) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        // Sort by descending visits
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Visits:");
        for (Map.Entry<String, Integer> e : list) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("Most visited: " + list.get(0).getKey());
    }
}
