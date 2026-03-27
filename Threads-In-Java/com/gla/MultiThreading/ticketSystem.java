package com.gla.MultiThreading;
import java.util.*;

    class Ticket extends Thread {

        private int ticketId;
        private String type;
        private int priority;

        public static Map<Integer, List<Long>> stats = new HashMap<>();

        public Ticket(int ticketId, String type, int priority) {
            this.ticketId = ticketId;
            this.type = type;
            this.priority = priority;
            this.setPriority(priority);
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();

            System.out.println("START -> Ticket " + ticketId +
                    " | Type: " + type +
                    " | Agent: " + getName() +
                    " | Priority: " + priority);

            try {
                int processTime = (new Random().nextInt(5) + 1) * 1000;
                Thread.sleep(processTime);
            } catch (InterruptedException e) {
                System.out.println("Ticket " + ticketId + " interrupted");
            }

            long end = System.currentTimeMillis();
            long timeTaken = (end - start) / 1000;

            // Store stats
            stats.putIfAbsent(priority, new ArrayList<>());
            stats.get(priority).add(timeTaken);

            System.out.println("END   -> Ticket " + ticketId +
                    " completed in " + timeTaken + " sec\n");
        }
    }

    // Main class
    public class ticketSystem {
        public static void main(String[] args) {

            List<Ticket> tickets = new ArrayList<>();

            // Create 10 mixed tickets
            tickets.add(new Ticket(1, "Critical Bug", 10));
            tickets.add(new Ticket(2, "Feature Request", 4));
            tickets.add(new Ticket(3, "General Query", 2));
            tickets.add(new Ticket(4, "Feedback", 1));
            tickets.add(new Ticket(5, "Critical Bug", 10));
            tickets.add(new Ticket(6, "General Query", 2));
            tickets.add(new Ticket(7, "Feature Request", 4));
            tickets.add(new Ticket(8, "Feedback", 1));
            tickets.add(new Ticket(9, "Critical Bug", 10));
            tickets.add(new Ticket(10, "General Query", 2));

            // Sort tickets by priority (High → Low)
            tickets.sort((a, b) -> b.getPriority() - a.getPriority());

            System.out.println("---- Queue Order (High to Low Priority) ----");
            int pos = 1;
            for (Ticket t : tickets) {
                System.out.println("Position " + pos++ +
                        " -> Ticket " + t.getName() +
                        " Priority: " + t.getPriority());
            }

            long systemStart = System.currentTimeMillis();

            // Start threads
            for (Ticket t : tickets) {
                t.setName("Agent-" + t.getId());
                t.start();
            }

            // Wait for completion
            for (Ticket t : tickets) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    System.out.println("Main interrupted");
                }
            }

            long systemEnd = System.currentTimeMillis();
            long totalTime = (systemEnd - systemStart) / 1000;

            // Display stats
            System.out.println("\n---- Statistics ----");
            for (Map.Entry<Integer, List<Long>> entry : Ticket.stats.entrySet()) {
                int priority = entry.getKey();
                List<Long> times = entry.getValue();

                double avg = times.stream().mapToLong(Long::longValue).average().orElse(0);
                System.out.println("Priority " + priority +
                        " Avg Time: " + avg + " sec");
            }

            System.out.println("\nTotal Processing Time: " + totalTime + " sec");
        }
    }

