package com.gla.generics.level3;
import java.util.*;
public class LibraryBook {
    public static void main(String[] args) {
        // Sorted by ISBN
        Map<String, String> catalog = new TreeMap<>();

        // 1. Add books
        catalog.put("978-111", "Java Basics");
        catalog.put("978-222", "Data Structures");
        catalog.put("978-333", "Algorithms");

        // 2. Search by ISBN
        String isbn = "978-222";
        if (catalog.containsKey(isbn)) {
            System.out.println("Book: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        // 3. Remove book
        catalog.remove("978-111");

        // 4. Print all sorted
        System.out.println("\nCatalog:");
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        // 5. Search by title (manual)
        String searchTitle = "Algorithms";
        System.out.println("\nSearch by Title:");
        for (Map.Entry<String, String> e : catalog.entrySet()) {
            if (e.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("Found ISBN: " + e.getKey());
            }
        }
    }
}
