package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Cshformat {

    /* package codechef; // don't place package name! */

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] num = lines.split("\\s+");
        int[] intNum = new int[num.length];
        for (int i = 0; i <testCase; i++) {
            intNum[i] = Integer.parseInt(num[i]);
            int i1 = intNum[i];
            if (i1 < 3)
                System.out.println(1);
            else if (i1 <= 3) {
                System.out.println(2);
            } else if (i1 < 60) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }

        }
    }
}
