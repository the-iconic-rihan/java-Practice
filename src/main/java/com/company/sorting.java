package com.company;

import java.util.Arrays;

public class sorting {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {54, -36, 2, 8, 6, 7, 3, 1};
//        descending  call
//        bubbleSort(arr);
//        ascending  call
//        bubbleSortAsc(arr);
//        selection(arr);
        insertion(arr);
    }

    //    bubble sort: For ascending  order
    public static void bubbleSortAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.println("length" + arr.length);
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

    //    selection sort
//    time complexity = O(N^2);
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;

                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
//        iterating over unsorted array.
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
//            placement of elements
            arr[j + 1] = current;

        }
        System.out.println(Arrays.toString(arr));
    }
}
