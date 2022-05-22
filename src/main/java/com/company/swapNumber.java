package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class swapNumber {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("The value of x and y after swap is " + x + " " + y);
    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        length of the array taking as string and converting it into Integer.
        int num = Integer.parseInt(in.readLine());
//        input the number separated by space.
        String s = in.readLine();
//        create a new array
        int[] arr = new int[num];
//        split the number by space in new array called s1.
        String[] s1 = s.split("\\s+");
//        typecasting the string numbers in integer.
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of x and y : ");
        int x = in.nextInt();
        int y = in.nextInt();
        swap(x, y);


    }
}
