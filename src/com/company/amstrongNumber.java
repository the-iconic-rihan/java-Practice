package com.company;

import java.util.Scanner;
import java.lang.Math;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder;
        int original_number, result = 0, n = sc.nextInt();
        ;
        original_number = num;
       /*for (; original_number != 0; original_number /= 10, ++n) {
            original_number = num;
            remainder += original_number % 10;
            result += Math.pow(original_number, n);
        }
        System.out.println(result);
        for (; original_number != 0; original_number /= 10) {
            remainder = original_number % 10;
            result += Math.pow(original_number, n);
        }*/

        while (original_number != 0) {
            remainder = original_number % 10;
            result += Math.pow(remainder, n);
            original_number /= 10;
        }
        System.out.println(result);
//        System.out.println(isAmstrong(result, original_number));
    }
}
