package com.gla.generics.level2;
import java.util.*;
// Player
class Player {
    int id;
    String name;

    Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        Player p = (Player) o;
        return this.id == p.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + name;
    }
}

// Match
class Match {
    Player p1, p2;

    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}

// Result
class Result {
    Player winner;

    Result(Player winner) {
        this.winner = winner;
    }

    public String toString() {
        return "Winner: " + winner.name;
    }
}

// Score
class Score {
    Player player;
    int points;

    Score(Player p, int points) {
        this.player = p;
        this.points = points;
    }
}

// Comparator for descending ranking
class ScoreComparator implements Comparator<Score> {
    public int compare(Score a, Score b) {
        return b.points - a.points;
    }
}

public class OnlineGamingTournament {
    public static void main(String[] args) {

        // 1. Register players
        Set<Player> players = new HashSet<>();
        players.add(new Player(1, "Aman"));
        players.add(new Player(2, "Riya"));
        players.add(new Player(1, "Duplicate")); // ignored

        // 2. Schedule matches
        Queue<Match> matchQueue = new LinkedList<>();
        List<Player> list = new ArrayList<>(players);

        if (list.size() >= 2) {
            matchQueue.add(new Match(list.get(0), list.get(1)));
        }

        // 3. Results
        List<Result> results = new ArrayList<>();
        Map<Player, Integer> scoreMap = new HashMap<>();

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();

            // simulate winner
            Player winner = m.p1;
            results.add(new Result(winner));

            scoreMap.put(winner, scoreMap.getOrDefault(winner, 0) + 10);
        }

        // 4. Leaderboard (TreeSet)
        TreeSet<Score> leaderboard = new TreeSet<>(new ScoreComparator());

        for (Map.Entry<Player, Integer> e : scoreMap.entrySet()) {
            leaderboard.add(new Score(e.getKey(), e.getValue()));
        }

        // Display results
        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s.player.name + " - " + s.points);
        }
    }
}
