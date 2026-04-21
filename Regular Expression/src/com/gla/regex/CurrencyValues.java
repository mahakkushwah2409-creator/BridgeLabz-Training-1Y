package com.gla.regex;
import java.util.regex.*;
public class CurrencyValues {
    public static void main(String[] args) {
        String text = "Price is $45.99 and discount is 10.50";
        Matcher m = Pattern.compile("\\$?\\d+(\\.\\d{2})?").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}