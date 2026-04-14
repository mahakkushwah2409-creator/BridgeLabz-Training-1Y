package com.gla.generics.level2;
import java.util.*;
class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return null; // n > size
            }
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list =
                new LinkedList<>(Arrays.asList("A","B","C","D","E"));

        System.out.println(findNthFromEnd(list, 2)); // D
    }
}