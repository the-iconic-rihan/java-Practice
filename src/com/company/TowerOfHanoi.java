package com.company;

public class TowerOfHanoi {
    public static void TowerOfHanoi1(int n, String src, String Hlper, String Dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + src + " " + Dest);
            return;
        }
        TowerOfHanoi1(n - 1, src, Dest, Hlper);
        System.out.println("Transfer disk " + src + " " + Dest);
        TowerOfHanoi1(n - 1, Hlper, src, Dest);

    }

    public static void main(String[] args) {
        int n = 3;
        TowerOfHanoi1(n, "S", "H", "D");
    }
}
