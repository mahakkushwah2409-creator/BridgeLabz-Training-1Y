package com.gla.Workshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(2);
        al.add(1);
        al.add(3);

        Set<Integer> set = new HashSet<>(al);

        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println(uniqueList);



    }
}
