package com.company;

public class partyInvitation {
    public static int invitation(int n) {
//        base cases ---> if no of guests are 1 or less than one return 1
        if (n <= 1) {
            return 1;
        }
//single
        int waysOne = invitation(n - 1);
//        pairs
        int ways2 = (n - 1) * invitation(n - 2);
        return waysOne + ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        int invited = invitation(n);
        System.out.println("There are " + invited + " ways to invite guests at party.");
    }
}
