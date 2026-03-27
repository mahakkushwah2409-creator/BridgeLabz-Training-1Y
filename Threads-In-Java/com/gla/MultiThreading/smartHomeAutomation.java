package com.gla.MultiThreading;

import java.time.LocalTime;

    // Generic Device class
    class Device implements Runnable {

        private String deviceName;
        private int interval; // in milliseconds

        public Device(String deviceName, int interval) {
            this.deviceName = deviceName;
            this.interval = interval;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        LocalTime.now() + " | " +
                                deviceName + " running | " +
                                "Thread: " + Thread.currentThread().getName() +
                                " | Priority: " + Thread.currentThread().getPriority()
                );

                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    System.out.println(deviceName + " interrupted");
                }
            }

            System.out.println(deviceName + " finished execution.");
        }
    }


    public class smartHomeAutomation {
        public static void main(String[] args) {

            // Create device objects with intervals
            Device tempSensor = new Device("Temperature Sensor", 5000);
            Device securityCamera = new Device("Security Camera", 3000);
            Device lightController = new Device("Light Controller", 4000);
            Device doorLock = new Device("Door Lock Monitor", 6000);

            // Create threads
            Thread t1 = new Thread(securityCamera, "Security-Thread");
            Thread t2 = new Thread(tempSensor, "Temperature-Thread");
            Thread t3 = new Thread(lightController, "Light-Thread");
            Thread t4 = new Thread(doorLock, "Door-Thread");

            // Set priorities
            t1.setPriority(10); // Security
            t2.setPriority(7);  // Temperature
            t3.setPriority(5);  // Light
            t4.setPriority(5);  // Door

            // Start all threads
            t1.start();
            t2.start();
            t3.start();
            t4.start();

            // Wait for all threads to finish
            try {
                t1.join();
                t2.join();
                t3.join();
                t4.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }

            System.out.println("All devices completed. Smart Home shutting down.");
        }
    }

