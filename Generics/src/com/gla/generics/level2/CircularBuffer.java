package com.gla.generics.level2;
public class CircularBuffer {
    int[] buffer;
    int size, front, rear, count;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;

        if (count == size) {
            front = (front + 1) % size; // overwrite
        } else {
            count++;
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4); // overwrite
        cb.display(); // 2 3 4
    }
}
