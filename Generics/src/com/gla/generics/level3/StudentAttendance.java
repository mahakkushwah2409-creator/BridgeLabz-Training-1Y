package com.gla.generics.level3;
import java.util.*;
public class StudentAttendance {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        // 1. Initialize students
        String[] students = {"Aman", "Riya", "John", "Neha", "Sam"};

        for (String s : students) {
            attendance.put(s, 0);
        }

        // 2. Simulate 15 days attendance
        String[][] days = {
                {"Aman", "Riya", "John"},
                {"Riya", "Neha"},
                {"Aman", "Sam"},
                {"Aman", "Riya"},
                {"John", "Neha"},
                {"Aman", "Riya", "Sam"},
                {"Riya"},
                {"Aman", "John"},
                {"Neha"},
                {"Aman", "Sam"},
                {"Riya", "John"},
                {"Aman"},
                {"Sam"},
                {"Riya", "Neha"},
                {"Aman", "John"}
        };

        for (String[] day : days) {
            for (String s : day) {
                attendance.put(s, attendance.get(s) + 1);
            }
        }

        // 3. Print under-attending (<10)
        System.out.println("Students with attendance < 10:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }
}
