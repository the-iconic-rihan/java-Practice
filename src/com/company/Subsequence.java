package com.company;

public class Subsequence {
    public static void FindSubsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);

//        giving an option to character to get added in subsequence or not
        FindSubsequence(str, idx + 1, newString + currElement);
//        not to be
        FindSubsequence(str, idx + 1, newString);

    }

    public static void main(String[] args) {
        String str = "abc";
        FindSubsequence(str, 0, "");

    }
}
