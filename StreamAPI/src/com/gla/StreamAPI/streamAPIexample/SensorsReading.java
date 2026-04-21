package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
public class SensorsReading {
    public static void main(String[] args) {
        List<Integer> Reading = Arrays.asList(25, 40, 55, 30, 70);
        int threshold = 40;
        Reading.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}