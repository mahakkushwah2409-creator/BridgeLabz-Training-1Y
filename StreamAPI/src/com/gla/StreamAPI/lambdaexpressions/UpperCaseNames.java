package com.gla.StreamAPI.lambdaexpressions;
import java.util.*;
public class UpperCaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vanshika", "rahul", "amit");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}