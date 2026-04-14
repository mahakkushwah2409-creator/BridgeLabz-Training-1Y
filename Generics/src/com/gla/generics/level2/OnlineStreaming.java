package com.gla.generics.level2;
import java.util.*;
class Movie {
    String title;
    String genre;

    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String toString() {
        return title + " (" + genre + ")";
    }
}
public class OnlineStreaming {
    public static void main(String[] args) {

        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Inception", "Sci-Fi"));

        Stack<Movie> history = new Stack<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        // 1. Add to Up Next
        upNext.addAll(allMovies);

        // 2 & 3. Watch movies
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            System.out.println("Watching: " + current);

            history.push(current);
            genres.add(current.genre);
        }
        // 4. Recommendations
        System.out.println("\nRecommended based on genres:");
        for (Movie m : allMovies) {
            if (genres.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}
