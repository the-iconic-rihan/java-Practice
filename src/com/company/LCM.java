package com.company;

import java.util.Scanner;

//a*b = gcd *lcm
//lcm = a*b/gcd
public class LCM extends HCFGCD {
    public static int lcm(int a, int b) {
        return a * b / HCFGCD.GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a, b));
    }
}
