package com.gla.regex;
public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with stupid words";

        String result = text.replaceAll("\\b(damn|stupid)\\b", "****");
        System.out.println(result);
    }
}
