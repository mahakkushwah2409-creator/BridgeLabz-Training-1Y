package com.gla.generics.level2;
import java.util.*;
class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list); // preserves order
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        System.out.println(removeDuplicates(list));
    }
}
