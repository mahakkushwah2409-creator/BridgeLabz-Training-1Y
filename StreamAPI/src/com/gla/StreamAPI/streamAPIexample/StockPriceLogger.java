package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(101.5, 102.3, 99.8, 105.2);

        prices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}