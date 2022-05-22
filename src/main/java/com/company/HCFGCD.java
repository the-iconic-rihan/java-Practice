package com.company;

import java.util.Scanner;

//GCD --> Greatest Common divisor
//HCF --> Highest Common factor
public class HCFGCD {
    public static int GCD(int a, int b) {
        int res = 0;
        while (a % b != 0) {
            res = a % b;
            a = b;
            b = res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(GCD(a, b));
       /* int g = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        System.out.println(g);*/

    }
}
