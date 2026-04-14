package com.gla.generics.level2;
import java.util.*;
class Team {
    int id;
    String name;
    int points;

    Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.points = 0;
    }

    public boolean equals(Object o) {
        Team t = (Team) o;
        return this.id == t.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }
}

// Comparator for ranking
class TeamComparator implements Comparator<Team> {
    public int compare(Team a, Team b) {
        return b.points - a.points;
    }
}

class Match {
    Team t1, t2;

    Match(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}

class Result {
    Team winner;

    Result(Team winner) {
        this.winner = winner;
    }
}

public class SportsTournament {
    public static void main(String[] args) {

        // 1. Register teams
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team(1, "A");
        Team t2 = new Team(2, "B");

        teams.add(t1);
        teams.add(t2);

        // Schedule match
        Queue<Match> queue = new LinkedList<>();
        queue.add(new Match(t1, t2));

        List<Result> results = new ArrayList<>();

        // 2 & 3. Process matches
        while (!queue.isEmpty()) {
            Match m = queue.poll();

            Team winner = m.t1; // simulate
            winner.points += 10;

            results.add(new Result(winner));
        }

        // 4. Leaderboard
        TreeSet<Team> leaderboard = new TreeSet<>(new TeamComparator());
        leaderboard.addAll(teams);

        System.out.println("Leaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t.name + " Points: " + t.points);
        }
    }
}
