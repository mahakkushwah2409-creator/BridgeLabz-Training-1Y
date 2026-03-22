package com.gla.ExceptionHandling;
    import java.util.Scanner;

    public class MultipleCatchExample {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = null; // You can change this to new int[]{10, 20, 30} to test valid case

            try {
                // Uncomment below to initialize array for testing
                arr = new int[]{10, 20, 30, 40, 50};

                System.out.print("Enter index: ");
                int index = sc.nextInt();

                int value = arr[index];  // may throw exceptions

                System.out.println("Value at index " + index + ": " + value);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            }
            catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }

            sc.close();
        }
    }

