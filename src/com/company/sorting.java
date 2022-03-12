package com.company;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {54,-36, 2, 8, 6, 7, 3, 1};
//        descending  call
        bubbleSort(arr);
//        ascending  call
        bubbleSortAsc(arr);

    }

    //    bubble sort: For ascending  order
    public static void bubbleSortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    bubble sort: For descending  order
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//time complexity = O(n^2) --> worst case scenario.
//   O(N) --> array is sorted.
//the algorithms which do not need any new array are also called as "in place sorting algorithms."
}
