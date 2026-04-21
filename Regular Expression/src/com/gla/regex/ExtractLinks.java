package com.gla.regex;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://google.com and http://example.org";
        Matcher m = Pattern.compile("https?://[^\\s]+").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
