package com.company;

import java.util.Scanner;

//check whether the number is even or not
public class CheckOddEven {
    static void oddEven(int num) {
        if (num % 2 == 0)
            System.out.println("The Entered number is even");
        else
            System.out.println("The Entered number is odd");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        oddEven(num);
    }
}
