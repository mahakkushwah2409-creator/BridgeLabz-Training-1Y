package com.gla.MultiThreading;

public class ExamHallmanagement {
    // Main class

        // Utility method to print thread state
        public static void printState(Thread t, String activity) {
            System.out.println(activity + " Thread State: " + t.getState());
        }

        public static void main(String[] args) {

            // Entry Monitoring (continuous)
            Runnable entryTask = () -> {
                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Student Entry Monitoring...");
                        Thread.sleep(2000);
                    }
                    System.out.println("Entry Monitoring Finished.");
                } catch (InterruptedException e) {
                    System.out.println("Entry Interrupted");
                }
            };

            // Question Paper Distribution (after 5 sec)
            Runnable questionTask = () -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Question Papers Distributed.");
                } catch (InterruptedException e) {
                    System.out.println("Question Distribution Interrupted");
                }
            };

            // Attendance Marking (after 10 sec)
            Runnable attendanceTask = () -> {
                try {
                    Thread.sleep(10000);
                    System.out.println("Attendance Marked.");
                } catch (InterruptedException e) {
                    System.out.println("Attendance Interrupted");
                }
            };

            // Answer Sheet Collection (after exam duration = 15 sec)
            Runnable collectionTask = () -> {
                try {
                    Thread.sleep(15000);
                    System.out.println("Answer Sheets Collected.");
                } catch (InterruptedException e) {
                    System.out.println("Collection Interrupted");
                }
            };

            // Create threads
            Thread entryThread = new Thread(entryTask, "Entry-Thread");
            Thread questionThread = new Thread(questionTask, "Question-Thread");
            Thread attendanceThread = new Thread(attendanceTask, "Attendance-Thread");
            Thread collectionThread = new Thread(collectionTask, "Collection-Thread");

            // Set priorities
            questionThread.setPriority(10);
            attendanceThread.setPriority(8);
            entryThread.setPriority(5);
            collectionThread.setPriority(7);

            // Print initial states
            printState(entryThread, "Entry");
            printState(questionThread, "Question");
            printState(attendanceThread, "Attendance");
            printState(collectionThread, "Collection");

            // Start threads
            entryThread.start();
            questionThread.start();
            attendanceThread.start();
            collectionThread.start();

            // Print states after starting
            printState(entryThread, "Entry");
            printState(questionThread, "Question");
            printState(attendanceThread, "Attendance");
            printState(collectionThread, "Collection");

            // Wait for all to finish
            try {
                entryThread.join();
                questionThread.join();
                attendanceThread.join();
                collectionThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }

            // Final states
            printState(entryThread, "Entry");
            printState(questionThread, "Question");
            printState(attendanceThread, "Attendance");
            printState(collectionThread, "Collection");

            System.out.println("Exam Hall Process Completed.");
        }
    }

