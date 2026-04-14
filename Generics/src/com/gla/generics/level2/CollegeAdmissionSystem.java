package com.gla.generics.level2;
import java.util.*;
class Student1{
    int id;
    String name;
    int marks;

    Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(Object o) {
        Student1 s = (Student1) o;
        return this.id == s.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

// Comparator for merit (descending)
class MeritComparator implements Comparator<Student1> {
    public int compare(Student1 a, Student1 b) {
        return b.marks - a.marks;
    }
}
public class CollegeAdmissionSystem {
    public static void main(String[] args) {

        List<Student1> applicants = new ArrayList<>();
        applicants.add(new Student1(1, "Aman", 85));
        applicants.add(new Student1(2, "Riya", 92));
        applicants.add(new Student1(3, "John", 70));

        // 2. Shortlist (marks >= 80)
        Set<Student1> shortlisted = new HashSet<>();
        for (Student1 s : applicants) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }

        // 3. Queue for interview
        Queue<Student1> interviewQueue = new LinkedList<>(shortlisted);

        // 4. Final merit list
        TreeSet<Student1> meritList = new TreeSet<>(new MeritComparator());

        while (!interviewQueue.isEmpty()) {
            Student1 s = interviewQueue.poll();
            meritList.add(s); // assume all selected
        }

        System.out.println("Final Merit List:");
        for (Student1 s : meritList) {
            System.out.println(s);
        }
    }
}
