package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
        PQ.offer(40);
        PQ.offer(12);
        PQ.offer(24);
        PQ.offer(36);
        System.out.println(PQ);
        PQ.poll();
        System.out.println(PQ);
        System.out.println(PQ.peek());
    }
}
