package com.gla.generics.level3;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 4000.0);
        cart.put("Phone", 2000.0);
        cart.put("Headphones", 500.0);

        // Display order
        System.out.println(cart);

        // Total
        double total = 0;
        for (double v : cart.values()) total += v;

        // Discount
        if (total > 5000) total *= 0.9;

        System.out.println("Total: " + total);

        // Remove item
        cart.remove("Headphones");
    }
}
