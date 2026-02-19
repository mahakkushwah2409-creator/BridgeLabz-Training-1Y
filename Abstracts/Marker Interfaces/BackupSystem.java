// Marker Interface
interface BackupSerializable {
    // No methods (Marker Interface)
}
class Customer implements BackupSerializable {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order implements BackupSerializable {

    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}
class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Object not eligible for backup.");
        }
    }
}
public class BackupSystem {

    public static void main(String[] args) {

        Customer customer = new Customer("Mahak");
        Order order = new Order(101);
        TempSessionData session = new TempSessionData("ABC123");

        BackupProcessor.processBackup(customer);
        BackupProcessor.processBackup(order);
        BackupProcessor.processBackup(session);
    }
}
