package com.gla.Workshop;
import java.util.*;


public class SubsetofArray {


        public static void main(String[] args) {

            int arr1[] = {1, 2, 3, 4, 5};
            int arr2[] = {3, 4, 5};

            if (isSubset(arr1, arr2)) {
                System.out.println("arr2 is subset of arr1");
            } else {
                System.out.println("arr2 is NOT subset of arr1");
            }

            int arr3[] = {1, 2, 3, 4, 5};
            int arr4[] = {1, 2, 9};

            if (isSubset(arr3, arr4)) {
                System.out.println("arr4 is subset of arr3");
            } else {
                System.out.println("arr4 is NOT subset of arr3");
            }
        }

        static boolean isSubset(int arr1[], int arr2[]) {
            HashSet<Integer> set = new HashSet<>();

            // store elements of arr1
            for (int num : arr1) {
                set.add(num);
            }

            // check all elements of arr2
            for (int num : arr2) {
                if (!set.contains(num)) {
                    return false;
                }
            }

            return true;
        }
    }
