package com.gla.generics.level2;
import java.util.*;
class Question {
    int id;
    String text;
    Question(int id, String text) {
        this.id = id;
        this.text = text;
    }
    public String toString() {
        return id + ": " + text;
    }
}
// Student class
class Student {
    String id;
    String name;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class OnlineExamination {
    public static void main(String[] args) {

        // 1. Unique students
        Set<String> studentIDs = new HashSet<>();
        Queue<Student> studentQueue = new LinkedList<>();

        // Enroll students (duplicates avoided)
        addStudent(studentIDs, studentQueue, new Student("S1", "Aman"));
        addStudent(studentIDs, studentQueue, new Student("S2", "Riya"));
        addStudent(studentIDs, studentQueue, new Student("S1", "Duplicate")); // ignored

        // 2. Questions list
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1, "What is Java?"));
        questions.add(new Question(2, "Explain OOP."));
        questions.add(new Question(3, "What is Queue?"));

        // Shuffle questions
        Collections.shuffle(questions);

        // 3. Serve students
        while (!studentQueue.isEmpty()) {
            Student s = studentQueue.poll();
            System.out.println("\nStudent taking exam: " + s);

            // 4. Navigation using Stack
            Stack<Question> history = new Stack<>();
            Stack<Question> forward = new Stack<>();

            for (Question q : questions) {
                System.out.println("Question: " + q);
                history.push(q);

                // simulate "back" action once
                if (history.size() > 1) {
                    Question prev = history.pop();
                    forward.push(prev);
                    System.out.println("Back to: " + history.peek());
                }
            }
        }
    }

    // helper method
    static void addStudent(Set<String> set, Queue<Student> queue, Student s) {
        if (set.add(s.id)) {
            queue.add(s);
        } else {
            System.out.println("Duplicate Student ID ignored: " + s.id);
        }
    }
}
