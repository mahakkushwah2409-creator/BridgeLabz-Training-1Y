package wrapperClasses;
import java.util.ArrayList;

    public class ProductRatingsAnalyzer {

        public static void main(String[] args) {

            // Primitive ratings
            int[] primitiveRatings = {4, 5, 3};

            // Wrapper ratings (may contain nulls)
            ArrayList<Integer> objectRatings = new ArrayList<>();
            objectRatings.add(5);
            objectRatings.add(null);
            objectRatings.add(2);

            // Combined list
            ArrayList<Integer> allRatings = new ArrayList<>();

            // Add primitive ratings (auto-boxing)
            for (int r : primitiveRatings) {
                allRatings.add(r); // int → Integer
            }

            // Add object ratings
            allRatings.addAll(objectRatings);

            // Calculate average (ignore nulls)
            int sum = 0;
            int count = 0;

            for (Integer rating : allRatings) {
                if (rating != null) {   // null check
                    sum += rating;      // auto-unboxing
                    count++;
                }
            }

            double average = (count > 0) ? (double) sum / count : 0.0;

            // Output
            System.out.println("All Ratings: " + allRatings);
            System.out.println("Average Rating: " + average);
        }
    }
