package com.company;

import java.util.Scanner;

public class fibonacci {
    //    printing the sum of the fibanacci series using recursive approach.
    public static int Fs(int num) {
        if (num <= 1)
            return 1;
        return Fs(num - 1) + Fs(num - 2);
    }

    //    printing the entire Fibonacci
    public static void FibonacciSeries(int num) {
        int a0 = 0, a1 = 1, sum;
        if (num <= 1)
            System.out.println(a1 + " ");
        else {
            System.out.print(a0 + " " + a1 + " ");
            for (int i = 3; i <= num; i++) {
                sum = a0 + a1;
                a0 = a1;
                a1 = sum;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
//        return FibonacciSeries(num - 1) + FibonacciSeries(num - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        FibonacciSeries(num);
        System.out.println(Fs(num));
    }
}
