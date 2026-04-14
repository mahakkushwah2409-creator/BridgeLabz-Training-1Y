package com.gla.generics.level2;
import java.util.*;
class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1); s.push(2); s.push(3);

        System.out.println(s.pop()); // 3
    }
}