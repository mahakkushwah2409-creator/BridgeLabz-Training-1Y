package com.gla.regex;
import java.util.regex.*;
public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact support@example.com and info@company.org";
        Matcher m = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
                .matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}