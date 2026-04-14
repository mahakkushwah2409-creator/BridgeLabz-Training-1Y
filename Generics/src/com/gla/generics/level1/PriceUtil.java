package com.gla.generics;
import java.util.*;
class Pro {
    double price;

    Pro(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Pro {
    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Pro {
    Laptop(double price) {
        super(price);
    }
}

class PriceUtil {

    public static double calculateTotal(List<? extends Pro> items) {
        double total = 0;

        for (Pro p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
                new Mobile(10000),
                new Mobile(20000)
        );

        List<Laptop> laptops = Arrays.asList(
                new Laptop(50000),
                new Laptop(70000)
        );
        System.out.println(calculateTotal(mobiles));
        System.out.println(calculateTotal(laptops));
    }
}