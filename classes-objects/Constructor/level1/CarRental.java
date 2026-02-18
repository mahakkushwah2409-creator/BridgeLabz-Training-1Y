class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000;

    CarRental() {
        customerName = "Customer";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * ratePerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel +
                " | Days: " + rentalDays +
                " | Total: " + totalCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental("Vanshika", "Swift", 4);
        c1.display();
    }
}
