package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(12);
        lhs.add(1);
        lhs.add(15);
        lhs.add(41);
        System.out.println(lhs);

    }
}
