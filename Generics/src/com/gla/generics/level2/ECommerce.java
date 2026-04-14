package com.gla.generics.level2;
import java.util.*;
// Order class
class Order {
    int orderId;
    String customerName;
    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }
    // For removing duplicates (based on orderId)
    public boolean equals(Object o) {
        Order o1 = (Order) o;
        return this.orderId == o1.orderId;
    }

    public int hashCode() {
        return Objects.hash(orderId);
    }

    public String toString() {
        return "OrderID: " + orderId + ", Name: " + customerName;
    }
}

public class ECommerce {
    public static void main(String[] args) {
        // 1. Store all orders
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(101, "Aman"));
        orderList.add(new Order(102, "Riya"));
        orderList.add(new Order(103, "John"));
        orderList.add(new Order(101, "Duplicate")); // duplicate

        // 2. Remove duplicates using Set
        Set<Order> uniqueOrders = new HashSet<>(orderList);

        // 3. Queue for processing (FIFO)
        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);

        // 4. Stack for failed orders
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("Processing Orders:\n");

        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.poll();
            System.out.println("Processing: " + current);

            // Simulate failure condition
            if (current.orderId % 2 == 0) { // even ID fails
                System.out.println("Failed: " + current);
                failedOrders.push(current);
            } else {
                System.out.println("Success: " + current);
            }
        }

        // Re-process failed orders
        System.out.println("\nReprocessing Failed Orders:\n");

        while (!failedOrders.isEmpty()) {
            Order retry = failedOrders.pop();
            System.out.println("Retrying: " + retry);
        }
    }
}
