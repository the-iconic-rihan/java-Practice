package com.company;

public class firstlastOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void occurance(String str, char target, int idx) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currElement = str.charAt(idx);
        if (currElement == target) {
            if (first == -1)
                first = idx;
        } else {
            last = idx;
        }
        occurance(str, 'a', idx + 1);

    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        occurance(str, 'a', 0);

    }
}
