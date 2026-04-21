package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
public class CustomerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vanshika", "rahul", "amit");
        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}