package wrapperClasses;

public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = { "250", "499", "99", "abc", "150"}     ;

        int total =0;

        for(String price : prices) {
            try {
                int value = Integer.parseInt(price);
                total+=value;
            }
            catch (NumberFormatException e) {
                System.out.println("skipped invalid number" + price);
            }
        }
        System.out.println("total price :" + total);
    }
}
