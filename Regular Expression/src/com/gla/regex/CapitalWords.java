package com.gla.regex;
import java.util.regex.*;
public class CapitalWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and New York";
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}