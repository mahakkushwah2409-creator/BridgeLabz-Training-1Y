package com.gla.Workshop;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
                int arr[] = {10,20,30,40,50,60,70};
                int k = 3;

                int n = arr.length;
                k = k % n;


                int temp[] = new int[n];

                int index = 0;


                for(int i = k; i < n; i++) {
                    temp[index++] = arr[i];
                }


                for(int i = 0; i < k; i++) {
                    temp[index++] = arr[i];
                }


                for(int num : temp) {
                    System.out.print(num + " ");
                }
            }
        }
