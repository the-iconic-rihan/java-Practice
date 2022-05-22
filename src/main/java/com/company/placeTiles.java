package com.company;

public class placeTiles {
    public static int tilesPlaced(int n, int m) {
//        if n==m it returns that we only have 2 ways to place the tiles
        if (n == m) {
            return 2;
        }
        //        if n<m it returns that we only have 1 way to place the tiles

        if (n < m) {
            return 1;
        }
//vertically placing tiles
        int verticallyPlaced = tilesPlaced(n - m, m);
//       horizontally places tiles
        int horizontalPlaced = tilesPlaced(n - 1, m);

        return verticallyPlaced + horizontalPlaced;
    }

    public static void main(String[] args) {
        int row = 4;
        int column = 2;
        int title = tilesPlaced(row, column);
        System.out.println(title);
    }
}
