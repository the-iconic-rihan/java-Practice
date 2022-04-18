package com.company;

public class permutation {
    public static void printPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.print(permutation + " ");
            return;
        }
//       loop to fill the 1st chair by first char.
        for (int i = 0; i < str.length(); i++) {
            char currElement = str.charAt(i);
/*          if you choose 'a' as currElement then "abc" => "bc" ,
if you choose 'b' as currElement then "abc" => "ac",if you choose 'c' as currElement then "abc" => "ab".
 */
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currElement);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}
