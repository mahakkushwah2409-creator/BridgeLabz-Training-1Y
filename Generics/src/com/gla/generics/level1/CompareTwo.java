package com.gla.generics;

class Utility {

    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}
public class CompareTwo {
    public static void main(String[] args) {

        System.out.println(Utility.isEqual(10, 10));       // true
        System.out.println(Utility.isEqual("Hi", "Hi"));   // true
        System.out.println(Utility.isEqual(5.5, 6.5));     // false
    }
}