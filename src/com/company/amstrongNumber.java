package com.company;

import java.util.Scanner;
import java.lang.Math;

public class amstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original_number, remainder, result = 0;
        original_number = num;


        while (original_number != 0) {

            remainder = original_number % 10;
            result += Math.pow(remainder, 3);
            original_number /= 10;
        }
        if (result == num) {
            System.out.println("The " + result + " is amstrong number.");
        } else {
            System.out.println("The " + result + " is not amstrong number.");
        }
    }
}
