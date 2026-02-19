class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account");
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationYears;

    public FixedDepositAccount(int accountNumber, double balance, int durationYears) {
        super(accountNumber, balance);
        this.durationYears = durationYears;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        System.out.println("Duration: " + durationYears + " years");
    }
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount c = new CheckingAccount(102, 8000, 2000);
        FixedDepositAccount f = new FixedDepositAccount(103, 20000, 3);

        s.displayAccountType();
        System.out.println();

        c.displayAccountType();
        System.out.println();

        f.displayAccountType();
    }
}
