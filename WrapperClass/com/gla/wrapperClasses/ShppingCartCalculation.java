package wrapperClasses;

public class ShppingCartCalculation {

    public static void main(String[] args) {

            // Prices stored as Strings
            String[] prices = {"250", "499", "99", "abc", "150"};

            int totalPrice = 0;

            for (String price : prices) {
                try {
                    // Convert String to int using Wrapper class
                    int value = Integer.parseInt(price);
                    totalPrice += value;
                }
                catch (NumberFormatException e) {
                    // Handle invalid price
                    System.out.println("Invalid price skipped: " + price);
                }
            }

            // Final total
            System.out.println("Total Price: " + totalPrice);
        }
    }

