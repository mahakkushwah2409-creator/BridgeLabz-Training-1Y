package com.gla.generics;
import java.util.*;
abstract class CourseType {
    String type;
    CourseType(String type) { this.type = type; }

    public String toString() {
        return type;
    }
}

class ExamCourse extends CourseType {
    ExamCourse() { super("Exam Course"); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() { super("Assignment Course"); }
}

class ResearchCourse extends CourseType {
    ResearchCourse() { super("Research Course"); }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}
// Wildcard handler
class CourseUtil {
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            System.out.println(c);
        }
    }
}