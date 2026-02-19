// Custom Marker Interface
interface SensitiveData {
    // No methods (marker only)
}
class UserCredentials implements SensitiveData {

    private String username;
    private String password;

    public UserCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getData() {
        return "Username: " + username + ", Password: " + password;
    }
}

class BankAccount implements SensitiveData {

    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getData() {
        return "Account Number: " + accountNumber;
    }
}
class EncryptionService {

    public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data of: "
                    + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption needed.");
        }
    }
}
public class DataSecurityApp {

    public static void main(String[] args) {

        UserCredentials credentials = new UserCredentials("admin", "12345");
        BankAccount account = new BankAccount("9876543210");
        Product product = new Product("Laptop");

        EncryptionService.process(credentials);
        EncryptionService.process(account);
        EncryptionService.process(product);
    }
}
