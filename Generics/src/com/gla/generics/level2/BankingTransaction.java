package com.gla.generics.level2;
import java.util.*;

// Account
class Account {
    int id;
    String name;
    double balance;

    Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public boolean equals(Object o) {
        Account a = (Account) o;
        return this.id == a.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " - " + name + " Balance: " + balance;
    }
}

// Transaction
class Transaction {
    int accId;
    String type; // deposit / withdraw
    double amount;

    Transaction(int accId, String type, double amount) {
        this.accId = accId;
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return accId + " " + type + " " + amount;
    }
}

public class BankingTransaction {
    public static void main(String[] args) {

        // Valid accounts
        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account(1, "Aman", 1000));
        accounts.add(new Account(2, "Riya", 2000));

        // Data structures
        List<Transaction> allTransactions = new ArrayList<>();
        Queue<Transaction> queue = new LinkedList<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        // 1. Add transactions
        queue.add(new Transaction(1, "deposit", 500));
        queue.add(new Transaction(2, "withdraw", 300));
        queue.add(new Transaction(3, "deposit", 200)); // invalid

        // 2 & 3. Process transactions
        while (!queue.isEmpty()) {
            Transaction t = queue.poll();

            Account acc = findAccount(accounts, t.accId);

            if (acc == null) {
                System.out.println("Invalid Account: " + t.accId);
                continue;
            }

            // execute
            if (t.type.equals("deposit")) {
                acc.balance += t.amount;
            } else if (t.type.equals("withdraw")) {
                if (acc.balance >= t.amount) {
                    acc.balance -= t.amount;
                } else {
                    System.out.println("Insufficient balance");
                    continue;
                }
            }

            allTransactions.add(t);
            rollbackStack.push(t);

            System.out.println("Processed: " + t);
        }

        // 4. Rollback last transaction
        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            Account acc = findAccount(accounts, last.accId);

            if (last.type.equals("deposit")) {
                acc.balance -= last.amount;
            } else {
                acc.balance += last.amount;
            }

            System.out.println("\nRollback Done: " + last);
        }

        // Final state
        System.out.println("\nAccounts:");
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    static Account findAccount(Set<Account> set, int id) {
        for (Account a : set) {
            if (a.id == id) return a;
        }
        return null;
    }
}
