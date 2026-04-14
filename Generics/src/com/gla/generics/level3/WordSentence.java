package com.gla.generics.level;
import java.util.*;
public class WordSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        // Normalize
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = sentence.split(" ");

        Map<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // Print result
        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
