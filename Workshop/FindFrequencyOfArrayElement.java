package com.gla.Workshop;

import java.util.Scanner;

public class FindFrequencyOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            boolean repeated = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                System.out.println(count);
            }
        }
        sc.close();
    }
}
