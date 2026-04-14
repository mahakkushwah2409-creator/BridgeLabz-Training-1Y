package com.gla.generics.level2;
import java.util.*;
public class CustomerFeedback{
    public static void main(String[] args) {

        List<String> feedbackList = new ArrayList<>();
        feedbackList.add("Good service");
        feedbackList.add("Fast delivery");
        feedbackList.add("Good service"); // duplicate

        // 2. Remove duplicates
        Set<String> uniqueFeedback = new HashSet<>(feedbackList);

        Queue<String> queue = new LinkedList<>(uniqueFeedback);
        Stack<String> recent = new Stack<>();

        // Process feedback
        while (!queue.isEmpty()) {
            String f = queue.poll();
            System.out.println("Processing: " + f);
            recent.push(f);
        }

        // 3. Show recent feedbacks
        System.out.println("\nRecent Feedback:");
        while (!recent.isEmpty()) {
            System.out.println(recent.pop());
        }
    }
}
