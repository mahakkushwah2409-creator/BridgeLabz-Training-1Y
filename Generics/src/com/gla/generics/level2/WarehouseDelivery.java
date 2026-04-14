package com.gla.generics.level2;
import java.util.*;
class Package {
    String id;
    String customer;

    Package(String id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String toString() {
        return id + " - " + customer;
    }
}

public class WarehouseDelivery{
    public static void main(String[] args) {

        Queue<Package> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        // 1. Add packages (avoid duplicates)
        addPackage(ids, pending, new Package("P1", "Aman"));
        addPackage(ids, pending, new Package("P2", "Riya"));
        addPackage(ids, pending, new Package("P1", "Duplicate")); // ignored

        // 2. Process deliveries
        while (!pending.isEmpty()) {
            Package p = pending.poll();

            if (p.id.equals("P2")) { // simulate return
                returned.push(p);
                System.out.println("Returned: " + p);
            } else {
                delivered.add(p);
                System.out.println("Delivered: " + p);
            }
        }

        // 3. Summary
        System.out.println("\nDelivered Packages:");
        for (Package p : delivered) {
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        for (Package p : returned) {
            System.out.println(p);
        }
    }

    static void addPackage(Set<String> set, Queue<Package> queue, Package p) {
        if (set.add(p.id)) {
            queue.add(p);
        } else {
            System.out.println("Duplicate Package Ignored: " + p.id);
        }
    }
}