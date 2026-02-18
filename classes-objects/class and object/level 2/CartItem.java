class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Item added to cart");
    }

    void removeItem() {
        quantity = 0;
        System.out.println("Item removed from cart");
    }

    void totalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c1 = new CartItem();
        c1.addItem("Book", 200, 3);
        c1.totalCost();
        c1.removeItem();
    }
}
