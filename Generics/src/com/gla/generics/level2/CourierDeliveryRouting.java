package com.gla.generics.level2;
import java.util.*;
class Parcel {
    String id;
    int priority;

    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public String toString() {
        return id + " Priority:" + priority;
    }
}
public class CourierDeliveryRouting {
    public static void main(String[] args) {

        Set<String> ids = new HashSet<>();
        PriorityQueue<Parcel> pq =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);
        Queue<Parcel> normal = new LinkedList<>();
        List<Parcel> completed = new ArrayList<>();

        // 1. Add parcels
        add(ids, pq, normal, new Parcel("P1", 5));
        add(ids, pq, normal, new Parcel("P2", 1));
        add(ids, pq, normal, new Parcel("P1", 3)); // duplicate

        // 2 & 3. Assign deliveries
        while (!pq.isEmpty()) {
            Parcel p = pq.poll();
            completed.add(p);
            System.out.println("Delivered (Priority): " + p);
        }

        while (!normal.isEmpty()) {
            Parcel p = normal.poll();
            completed.add(p);
            System.out.println("Delivered: " + p);
        }

        // 4. Summary
        System.out.println("\nCompleted:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
    }

    static void add(Set<String> set, PriorityQueue<Parcel> pq,
                    Queue<Parcel> q, Parcel p) {
        if (set.add(p.id)) {
            if (p.priority > 2) {
                pq.add(p);
            } else {
                q.add(p);
            }
        } else {
            System.out.println("Duplicate ID: " + p.id);
        }
    }
}