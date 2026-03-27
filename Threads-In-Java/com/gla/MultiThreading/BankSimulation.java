package com.gla.MultiThreading;

    class BankAccount implements Runnable {

        private String accountHolder;
        private String accountType;

        // Constructor
        public BankAccount(String accountHolder, String accountType) {
            this.accountHolder = accountHolder;
            this.accountType = accountType;
        }

        @Override
        public void run() {
            // Simulate 3 balance checks
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                        accountHolder + " (" + accountType + ") is checking balance | " +
                                "Thread: " + Thread.currentThread().getName() +
                                " | Priority: " + Thread.currentThread().getPriority()
                );

                try {
                    Thread.sleep(2000); // 2 seconds delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }

    // Main class
    public class BankSimulation {
        public static void main(String[] args) {

            // Create BankAccount objects
            BankAccount premiumUser = new BankAccount("Alice", "Premium");
            BankAccount regularUser = new BankAccount("Bob", "Regular");
            BankAccount basicUser = new BankAccount("Charlie", "Basic");

            // Create Threads
            Thread t1 = new Thread(premiumUser, "Premium-Thread");
            Thread t2 = new Thread(regularUser, "Regular-Thread");
            Thread t3 = new Thread(basicUser, "Basic-Thread");

            // Set priorities
            t1.setPriority(10); // Premium
            t2.setPriority(5);  // Regular
            t3.setPriority(1);  // Basic

            // Start threads
            t1.start();
            t2.start();
            t3.start();
        }
    }

