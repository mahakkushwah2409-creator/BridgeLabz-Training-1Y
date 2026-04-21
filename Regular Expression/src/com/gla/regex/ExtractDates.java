package com.gla.regex;
import java.util.regex.*;
public class ExtractDates {
    public static void main(String[] args) {
        String text = "12/05/2023, 15/08/2024, 29/02/2020";
        Matcher m = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b")
                .matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
