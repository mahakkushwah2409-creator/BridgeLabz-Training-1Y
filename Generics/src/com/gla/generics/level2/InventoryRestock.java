package com.gla.generics.level2;
import java.util.*;
class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " Price:" + price + " Stock:" + stock;
    }
}

public class InventoryRestock {
    public static void main(String[] args) {

        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockStack = new Stack<>();

        // 1. Add products (avoid duplicates)
        addProduct(productNames, products, new Product("Milk", 50, 5));
        addProduct(productNames, products, new Product("Bread", 30, 2));
        addProduct(productNames, products, new Product("Milk", 60, 10)); // duplicate

        // 2. Identify low stock (<5)
        for (Product p : products) {
            if (p.stock < 5) {
                restockQueue.add(p);
            }
        }

        // 3. Process restock
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;
            restockStack.push(p);
            System.out.println("Restocked: " + p);
        }

        // 4. Undo last restock
        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            last.stock -= 10;
            System.out.println("Undo Restock: " + last);
        }
    }

    static void addProduct(Set<String> set, List<Product> list, Product p) {
        if (set.add(p.name)) {
            list.add(p);
        } else {
            System.out.println("Duplicate Product Ignored: " + p.name);
        }
    }
}
