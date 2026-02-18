class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void totalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total cost: " + total);
    }

    public static void main(String[] args) {
        Item i1 = new Item(1, "Pen", 10);
        i1.displayItem();
        i1.totalCost(5);
    }
}
