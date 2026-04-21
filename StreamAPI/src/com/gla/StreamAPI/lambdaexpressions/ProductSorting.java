package com.gla.StreamAPI.lambdaexpressions;
import java.util.*;
class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}
public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 80000, 4.5),
                new Product("Phone", 30000, 4.8),
                new Product("Tablet", 20000, 4.2)
        );
        // Sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sort by Price:");
        products.forEach(System.out::println);
        // Sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSort by Rating:");
        products.forEach(System.out::println);
    }
}