package com.company;

public class CheckArrSorted {

    public static boolean sorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        int currElement = arr[idx];
        if (currElement < arr[idx + 1]) {
            return sorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        System.out.println(sorted(arr, 0));
    }
}
