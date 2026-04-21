package com.gla.StreamAPI.streamAPIexample;
import java.util.*;
public class EventWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Vanshika", "Rahul", "Amit");
        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}