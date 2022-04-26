package com.company;

import java.util.ArrayList;

public class Subset {
// time complexity of this problem is 2^n;

    public static void PrintSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            System.out.print(subset);
            return;
        }
//        choice--> want to come
        subset.add(n);
        PrintSubset(n - 1, subset);

//        choice --> not want to come
//        assuming the element added in subset is at last index and using it as index we remove the element
        subset.remove(subset.size() - 1);
        PrintSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        PrintSubset(n, subset);
    }
}
