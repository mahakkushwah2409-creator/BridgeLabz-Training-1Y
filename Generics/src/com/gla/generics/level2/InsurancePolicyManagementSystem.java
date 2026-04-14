package com.gla.generics.level2;
import java.time.LocalDate;
import java.util.*;
// Policy class
class Policy {
    String policyNumber;
    String name;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(String policyNumber, String name, LocalDate expiryDate,
                  String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.name = name;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // uniqueness based on policyNumber
    public boolean equals(Object o) {
        Policy p = (Policy) o;
        return this.policyNumber.equals(p.policyNumber);
    }

    public int hashCode() {
        return policyNumber.hashCode();
    }

    public String toString() {
        return policyNumber + " " + name + " " + expiryDate +
                " " + coverageType + " " + premium;
    }
}

// Comparator for TreeSet
class ExpiryComparator implements Comparator<Policy> {
    public int compare(Policy p1, Policy p2) {
        return p1.expiryDate.compareTo(p2.expiryDate);
    }
}

public class InsurancePolicyManagementSystem{
    public static void main(String[] args) {

        // Different Sets
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>(new ExpiryComparator());

        // Sample data
        Policy p1 = new Policy("P1", "Aman", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P2", "Riya", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy("P3", "John", LocalDate.now().plusDays(20), "Home", 4000);
        Policy p4 = new Policy("P1", "Duplicate", LocalDate.now().plusDays(5), "Health", 6000);

        // Add policies
        hashSet.add(p1); hashSet.add(p2); hashSet.add(p3); hashSet.add(p4);
        linkedSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        // 1. Display all policies
        System.out.println("All Policies:");
        for (Policy p : hashSet) {
            System.out.println(p);
        }

        // 2. Expiring within 30 days
        System.out.println("\nExpiring Soon:");
        LocalDate today = LocalDate.now();
        for (Policy p : hashSet) {
            if (p.expiryDate.isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }

        // 3. Filter by coverage type
        System.out.println("\nHealth Policies:");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase("Health")) {
                System.out.println(p);
            }
        }

        // 4. Find duplicates (using list)
        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policy Numbers:");

        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                System.out.println(p.policyNumber);
            }
        }

        // TreeSet sorted output
        System.out.println("\nSorted by Expiry:");
        for (Policy p : treeSet) {
            System.out.println(p);
        }
    }
}