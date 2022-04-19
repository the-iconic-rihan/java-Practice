package com.company;

public class maze {
    public static int countPath(int i, int j, int n, int m) {

        if (i == n || j == m) {
            return 0;
        }
//        if we are at the corner cells just move to one direction
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
//        move downwards
        int downPaths = countPath(i + 1, j, n, m);
//        move right
        int rightPath = countPath(i, j + 1, n, m);
        return downPaths + rightPath;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(countPath(0, 0, n, m));
    }
}
