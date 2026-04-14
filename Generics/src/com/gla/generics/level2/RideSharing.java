package com.gla.generics.level2;

import java.util.*;

// Ride Request
class RideRequest {
    String customerName;
    int priority; // higher = urgent

    RideRequest(String name, int priority) {
        this.customerName = name;
        this.priority = priority;
    }

    public String toString() {
        return customerName + " (Priority: " + priority + ")";
    }
}

// Driver
class Driver {
    int id;
    String name;

    Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        Driver d = (Driver) o;
        return this.id == d.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + name;
    }
}

// Ride
class Ride {
    RideRequest request;
    Driver driver;

    Ride(RideRequest r, Driver d) {
        this.request = r;
        this.driver = d;
    }

    public String toString() {
        return request.customerName + " served by " + driver.name;
    }
}

public class RideSharing{
    public static void main(String[] args) {

        // 1. Ride requests
        Queue<RideRequest> normalQueue = new LinkedList<>();

        PriorityQueue<RideRequest> priorityQueue =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        normalQueue.add(new RideRequest("Aman", 2));
        normalQueue.add(new RideRequest("Riya", 5));
        normalQueue.add(new RideRequest("John", 1));

        priorityQueue.addAll(normalQueue);

        // 2. Drivers
        Set<Driver> drivers = new HashSet<>();
        drivers.add(new Driver(1, "Driver1"));
        drivers.add(new Driver(2, "Driver2"));

        // 3. Completed rides
        List<Ride> completedRides = new ArrayList<>();

        // 4. Assign rides (priority first)
        while (!priorityQueue.isEmpty() && !drivers.isEmpty()) {

            RideRequest req = priorityQueue.poll();

            Driver driver = drivers.iterator().next(); // get any driver
            drivers.remove(driver);

            Ride ride = new Ride(req, driver);
            completedRides.add(ride);

            System.out.println("Assigned: " + ride);
        }
        // Show history
        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}
