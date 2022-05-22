package com.company;

public class keypad {

    public static void printCombo(String str, int idx, String[] keymap, String combination) {
        if (idx == str.length()) {
            System.out.print(combination + " ");
            return;
        }
        char currElement = str.charAt(idx);
        String mapping = keymap[currElement - '0'];
        System.out.println(mapping);
        for (int i = 0; i < mapping.length(); i++) {
            printCombo(str, idx + 1, keymap, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        String[] keymap = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        printCombo(str, 0, keymap, "");
    }
}
