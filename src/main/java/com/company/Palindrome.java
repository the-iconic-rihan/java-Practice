package com.company;

import java.util.Scanner;

public class Palindrome {
    public static int CheckPalindrome(int num) {
        int result = 0;
        while (num != 0) {

            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;

    }

    public static int isPalindrome(int num) {
        int result = CheckPalindrome(num);
        if (num == result)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int res = isPalindrome(num);
        if (res == 1)
            System.out.println("The number is palindrome.");
        else
            System.out.println("The given number is not a palindrome.");
    }
}
