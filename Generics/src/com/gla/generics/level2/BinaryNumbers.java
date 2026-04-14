package com.gla.generics.level2;
import java.util.*;
public class BinaryNumbers {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
    public static void main(String[] args) {
        generate(5); // 1 10 11 100 101
    }
}