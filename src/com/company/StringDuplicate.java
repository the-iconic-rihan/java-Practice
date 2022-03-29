package com.company;

public class StringDuplicate {

    public static void SearchDuplicate(String str, int idx, String newString, boolean[] map) {
        if (idx == map.length - 1) {
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);
//        !map[currElement - 'a' == true = !false which means if map index contains false it will add currElement in the newString and will update the false to true.
//        currElement - 'a' = i.e  'a'-'a' == 0 it means we are at a character
        if (!map[currElement - 'a']) {
            newString += currElement;
            map[currElement - 'a'] = true;

        }
        SearchDuplicate(str, idx + 1, newString, map);

    }

    public static void main(String[] args) {
        boolean[] map = new boolean[26];
        for (int i = 0; i < map.length - 1; i++) {
            map[i] = false;
        }
        String str = "axbcxxd";
        SearchDuplicate(str, 0, "", map);
    }
}
