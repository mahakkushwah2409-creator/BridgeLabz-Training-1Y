package com.gla.generics.level2;
import java.util.*;
class ReverseList {
    public static <T> void reverse(List<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(arrayList);
        System.out.println("ArrayList: " + arrayList);
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverse(linkedList);
        System.out.println("LinkedList: " + linkedList);
    }
}
