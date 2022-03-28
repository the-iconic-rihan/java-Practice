package com.company;

public class AppendX {
    public static void AppendXLast(String str, int idx, char target, int count, String newStr) {

        if (idx == str.length()) {
            StringBuilder newStrBuilder = new StringBuilder(newStr);
            for (int i = 0; i < count; i++) {
                newStrBuilder.append('x');
            }
            newStr = newStrBuilder.toString();
            System.out.println(newStr);
            return;
        }
        char currElement = str.charAt(idx);
        if (currElement == target) {
            count++;
        } else {
            newStr += currElement;

        }
        AppendXLast(str, idx + 1, target, count, newStr);

    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        AppendXLast(str, 0, 'x', 0, "");
    }
}
