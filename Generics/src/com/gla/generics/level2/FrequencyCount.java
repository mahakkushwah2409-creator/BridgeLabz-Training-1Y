package com.gla.generics.level2;
import java.util.*;
class FrequencyCount {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String str : list) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        System.out.println(countFrequency(list));
    }
}