class Vehicle implements Cloneable {

    private String model;
    private double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Override clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    public void display() {
        System.out.println("Model: " + model + ", Price: ₹" + price);
    }
}
public class PrototypeDemo {

    public static void main(String[] args) {

        try {
            // Original object
            Vehicle original = new Vehicle("Tesla Model S", 7500000);
            original.display();

            // Cloned object
            Vehicle cloned = (Vehicle) original.clone();
            cloned.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
