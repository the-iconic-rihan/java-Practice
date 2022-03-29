package com.company;

import java.util.HashSet;

public class Subsequence {
    public static void FindSubsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currElement = str.charAt(idx);
        FindSubsequence(str, idx + 1, newString + currElement);
        FindSubsequence(str, idx + 1, newString);
    }

    public static void FindUniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (!set.contains(newString)) {
                set.add(newString);
                System.out.print(newString);
            }
            return;
        }
        char currElement = str.charAt(idx);

//        giving an option to character to get added in subsequence or not
        FindUniqueSubsequence(str, idx + 1, newString + currElement, set);
//        not to be
        FindUniqueSubsequence(str, idx + 1, newString, set);

    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequence");
        FindSubsequence(str, 0, "");
        HashSet<String> set = new HashSet<>();
        String str1 = "aaa";
        System.out.println("unique subsequence");
        FindUniqueSubsequence(str1, 0, "", set);


    }
}
