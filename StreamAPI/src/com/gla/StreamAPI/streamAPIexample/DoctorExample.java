package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
class Doctor {
    String name;
    String specialty;
    boolean available;
    Doctor(String name, String specialty, boolean available) {
        this.name = name;
        this.specialty = specialty;
        this.available = available;
    }
    public String toString() {
        return name + " | " + specialty;
    }
}
public class DoctorExample {
    public static void main(String[] args) {
        List<Doctor> list = Arrays.asList(
                new Doctor("Dr A", "Cardiology", true),
                new Doctor("Dr B", "Neurology", false),
                new Doctor("Dr C", "Orthopedic", true)
        );
        list.stream()
                .filter(d -> d.available)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(System.out::println);
    }
}