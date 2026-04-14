package com.gla.generics.level3;
import java.util.*;
public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        // Simulate 10 votes
        String[] inputVotes = {
                "Aman", "Riya", "Aman", "John", "Riya",
                "Aman", "John", "Riya", "Riya", "Aman"
        };

        // Count votes
        for (String v : inputVotes) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        // Find winner
        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        // Output
        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nWinner: " + winner);
    }
}