package com.gla.generics;
import java.util.*;
abstract class JobRole {
    String role;
    JobRole(String role) { this.role = role; }

    public String toString() {
        return role;
    }
}
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}
class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    private T role;

    Resume(T role) {
        this.role = role;
    }

    public void process() {
        System.out.println("Processing resume for " + role);
    }
}

// Wildcard pipeline
class ResumeProcessor {
    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println("Screening for " + r);
        }
    }
}

// Test
class AIResume{
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        r1.process();

        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist()
        );
        ResumeProcessor.processAll(roles);
    }
}