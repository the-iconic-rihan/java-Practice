package com.company;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
//        adding element at starting
        adq.offerFirst(12);
//        Adding element at end.
        adq.offerLast(14);
//        //        Adding element at end.
        adq.offer(23);
        adq.offerLast(35);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq.pollLast());
        System.out.println(adq.pollFirst());

        System.out.println(adq);

    }
}
