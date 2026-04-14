package com.gla.generics;
import java.util.*;

class Products<T> {
    String name;
    double price;
    T category;

    Products(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return name + " - " + price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Categories
class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class MarketplaceUtil {

    public static <T extends Products<?>> void applyDiscount(T products, double percent) {
        double newPrice = products.getPrice() * (1 - percent / 100);
        products.setPrice(newPrice);
    }
}

// Test
class Online {
    public static void main(String[] args) {

        Products<BookCategory> book = new Products<>("Java Book", 500, new BookCategory());

        MarketplaceUtil.applyDiscount(book, 10);

        System.out.println(book);
    }
}
