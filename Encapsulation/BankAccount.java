abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String acc, double bal) {
        super(acc, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}
