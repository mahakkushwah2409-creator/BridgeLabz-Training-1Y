class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void display() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }
}

class Test3 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 101;
        s.accountHolder = "Vanshika";
        s.setBalance(5000);

        s.display();
        System.out.println("Balance: " + s.getBalance());
    }
}
