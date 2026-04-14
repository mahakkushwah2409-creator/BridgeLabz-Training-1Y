package com.gla.generics;

    class Box<T> {
        private T value;

        // set value
        public void set(T value) {
            this.value = value;
        }

        // get value
        public T get() {
            return value;
        }
    }

    public class Main {
        public static void main(String[] args) {

            // Integer
            Box<Integer> intBox = new Box<>();
            intBox.set(10);
            System.out.println("Integer: " + intBox.get());

            // String
            Box<String> strBox = new Box<>();
            strBox.set("Hello");
            System.out.println("String: " + strBox.get());

            // Double
            Box<Double> doubleBox = new Box<>();
            doubleBox.set(5.5);
            System.out.println("Double: " + doubleBox.get());
        }
    }