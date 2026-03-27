package com.gla.MultiThreading;


    import java.time.LocalTime;

    class Order implements Runnable {

        private int orderId;
        private String restaurant;
        private int deliveryTime; // in seconds
        private String deliveryType;

        public Order(int orderId, String restaurant, int deliveryTime, String deliveryType) {
            this.orderId = orderId;
            this.restaurant = restaurant;
            this.deliveryTime = deliveryTime;
            this.deliveryType = deliveryType;
        }

        @Override
        public void run() {
            long startTime = System.currentTimeMillis();

            try {
                // Stage 1: Picked up
                System.out.println(LocalTime.now() + " | Order " + orderId +
                        " from " + restaurant + " PICKED UP by " +
                        Thread.currentThread().getName());

                Thread.sleep(deliveryTime * 500); // half time

                // Stage 2: In Transit
                System.out.println(LocalTime.now() + " | Order " + orderId +
                        " IN TRANSIT handled by " +
                        Thread.currentThread().getName());

                Thread.sleep(deliveryTime * 500); // remaining time

                // Stage 3: Delivered
                System.out.println(LocalTime.now() + " | Order " + orderId +
                        " DELIVERED by " +
                        Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println("Order " + orderId + " interrupted");
            }

            long endTime = System.currentTimeMillis();
            long totalTime = (endTime - startTime) / 1000;

            System.out.println("Order " + orderId +
                    " completed in " + totalTime + " seconds.\n");
        }
    }

    // Main class
    public class FoodDeliverySystem {
        public static void main(String[] args) {

            // Create orders
            Order o1 = new Order(101, "Dominos", 4, "Express");
            Order o2 = new Order(102, "KFC", 6, "Standard");
            Order o3 = new Order(103, "Burger King", 8, "Economy");
            Order o4 = new Order(104, "Pizza Hut", 5, "Express");
            Order o5 = new Order(105, "McDonald's", 7, "Standard");

            // Create threads
            Thread t1 = new Thread(o1, "Agent-1");
            Thread t2 = new Thread(o2, "Agent-2");
            Thread t3 = new Thread(o3, "Agent-3");
            Thread t4 = new Thread(o4, "Agent-4");
            Thread t5 = new Thread(o5, "Agent-5");

            // Set priorities
            t1.setPriority(10); // Express
            t2.setPriority(5);  // Standard
            t3.setPriority(3);  // Economy
            t4.setPriority(10); // Express
            t5.setPriority(5);  // Standard

            // Start threads
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

            // Wait for all deliveries to finish
            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
                t5.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }

            System.out.println("All orders delivered successfully!");
        }
    }

