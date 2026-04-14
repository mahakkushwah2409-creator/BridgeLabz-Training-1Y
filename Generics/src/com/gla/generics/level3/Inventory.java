package com.gla.generics.level3;
import java.util.*;
public class Inventory {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add products
        inventory.put("Milk", 10);
        inventory.put("Bread", 5);
        inventory.put("Eggs", 2);

        // 2. Customer buys (reduce stock)
        String item = "Eggs";
        inventory.put(item, inventory.getOrDefault(item, 0) - 2);

        if (inventory.get(item) <= 0) {
            inventory.remove(item);
            System.out.println(item + " is out of stock");
        }

        // 3. New shipment
        inventory.put("Milk", inventory.getOrDefault("Milk", 0) + 5);

        // 4. Query product
        String query = "Bread";
        if (inventory.containsKey(query)) {
            System.out.println(query + " stock: " + inventory.get(query));
        } else {
            System.out.println(query + " not stocked");
        }

        // Print out-of-stock items (example check)
        System.out.println("\nOut of Stock:");
        for (String key : inventory.keySet()) {
            if (inventory.get(key) == 0) {
                System.out.println(key);
            }
        }

        System.out.println("\nCurrent Inventory: " + inventory);
    }
}