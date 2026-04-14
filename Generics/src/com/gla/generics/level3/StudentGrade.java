package com.gla.generics.level3;
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        // Sorted map (alphabetical order)
        Map<String, Double> grades = new TreeMap<>();

        // 1. Add students
        grades.put("Aman", 85.5);
        grades.put("Riya", 92.0);
        grades.put("John", 78.0);

        // 2. Update grade (re-test)
        grades.put("John", 82.0);

        // 3. Remove student
        grades.remove("Aman");

        // 4. Print sorted
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
