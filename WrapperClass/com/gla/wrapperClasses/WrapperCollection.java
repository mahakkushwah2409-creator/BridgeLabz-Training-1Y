package wrapperClasses;
import java.util.ArrayList;

public class WrapperCollection {

    public static void main(String[] args) {

            double[] prices = {10.5, 20.0, 35.75, 5.5};

            // Convert primitive array to ArrayList<Double>
            ArrayList<Double> priceList = new ArrayList<>();

            for (double p : prices) {
                priceList.add(p); // auto-boxing (double → Double)
            }

            // Find highest price
            double max = priceList.get(0);
            double sum = 0;

            for (Double price : priceList) {
                if (price > max) {
                    max = price;
                }
                sum += price; // auto-unboxing (Double → double)
            }

            // Calculate average
            double average = sum / priceList.size();

            // Print results
            System.out.println("Prices: " + priceList);
            System.out.println("Highest Price: " + max);
            System.out.println("Average Price: " + average);
        }
    }

