package com.gla.generics.level3;
import java.util.*;
public class CourseRegistration {
    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 60);
        courses.put("CS103", 3);
        courses.put("CS104", 55);
        courses.put("CS105", 2);

        // Add/drop
        courses.put("CS101", courses.get("CS101") + 5);
        courses.put("CS103", Math.max(0, courses.get("CS103") - 1));

        System.out.println("Near Full:");
        for (String c : courses.keySet()) {
            if (courses.get(c) >= 50) System.out.println(c);
        }

        System.out.println("Under-subscribed:");
        for (String c : courses.keySet()) {
            if (courses.get(c) < 5) System.out.println(c);
        }
    }
}
