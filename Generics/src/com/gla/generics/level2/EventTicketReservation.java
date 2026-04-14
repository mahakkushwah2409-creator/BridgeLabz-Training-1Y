package com.gla.generics.level2;

import java.util.*;

class Booking {
    String user;
    boolean isVIP;

    Booking(String user, boolean isVIP) {
        this.user = user;
        this.isVIP = isVIP;
    }

    public String toString() {
        return user + (isVIP ? " (VIP)" : "");
    }
}

public class EventTicketReservation {
    public static void main(String[] args) {

        Set<String> users = new HashSet<>();
        Queue<Booking> normalQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue =
                new PriorityQueue<>((a, b) -> Boolean.compare(b.isVIP, a.isVIP));

        List<Booking> confirmed = new ArrayList<>();

        // 1. Register users
        register(users, "Aman");
        register(users, "Riya");
        register(users, "Aman"); // duplicate

        // 2. Add bookings
        normalQueue.add(new Booking("Aman", false));
        vipQueue.add(new Booking("Riya", true));

        // 3 & 4. Process VIP first
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            confirmed.add(b);
            System.out.println("VIP Confirmed: " + b);
        }

        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.poll();
            confirmed.add(b);
            System.out.println("Confirmed: " + b);
        }
    }

    static void register(Set<String> set, String user) {
        if (!set.add(user)) {
            System.out.println("Duplicate User: " + user);
        }
    }
}
