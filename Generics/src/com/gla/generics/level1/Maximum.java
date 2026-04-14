package com.gla.generics;

class MaxUtil {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T largest = a;

        if (b.compareTo(largest) > 0) {
            largest = b;
        }
        if (c.compareTo(largest) > 0) {
            largest = c;
        }
        return largest;
    }
}
public class Maximum{
    public static void main(String[] args) {

        System.out.println(MaxUtil.max(10, 20, 15));           // 20
        System.out.println(MaxUtil.max("Apple", "Banana", "Mango")); // Mango
        System.out.println(MaxUtil.max(2.5, 3.1, 1.9));        // 3.1
    }
}
