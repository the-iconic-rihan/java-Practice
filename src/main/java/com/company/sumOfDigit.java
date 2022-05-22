package com.company;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;

        }
        System.out.println(sum);
    }
}
