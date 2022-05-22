package com.company;

import java.util.Scanner;

public class primeNumberN {
    public static int isPrimeNumber(int num) {
//        check the number is divisble by 1 and itself.
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 2; i < num; i++) {
            if (isPrimeNumber(i) == 1)
                System.out.print(i + ", ");
        }
        System.out.println();
    }
}
