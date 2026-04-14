package com.gla.generics.level2;
import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        // 1. Add books
        books.add(new Book("Java"));
        books.add(new Book("DSA"));

        // 2. Register members
        register(members, "M1");
        register(members, "M2");
        register(members, "M1"); // duplicate

        // Issue books
        issueQueue.addAll(books);

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            System.out.println("Issued: " + b);

            // simulate return
            returned.push(b);
        }

        // 4. Re-issue last returned
        if (!returned.isEmpty()) {
            Book b = returned.pop();
            System.out.println("Re-issued: " + b);
        }
    }

    static void register(Set<String> set, String id) {
        if (!set.add(id)) {
            System.out.println("Duplicate Member: " + id);
        }
    }
}