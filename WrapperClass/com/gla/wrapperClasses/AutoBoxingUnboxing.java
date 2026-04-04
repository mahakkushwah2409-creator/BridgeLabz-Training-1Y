package wrapperClasses;

import java.util.ArrayList;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(5);
        int sum =0;
        for (Integer num : l) {
            sum += num;

        }
        System.out.println("Sum of numbers = " + sum);

        }
}
