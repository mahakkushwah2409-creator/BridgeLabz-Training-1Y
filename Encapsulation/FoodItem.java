abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println(itemName + " Total: " + calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        itemName = name;
        this.price = price;
        quantity = qty;
    }

    double calculateTotalPrice() {
        return price * quantity + 50;
    }

    public double applyDiscount() {
        return 20;
    }

    public String getDiscountDetails() {
        return "Flat ₹20";
    }
}
