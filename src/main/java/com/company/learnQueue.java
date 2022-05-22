package com.company;

import java.util.Queue;
import java.util.LinkedList;

public class learnQueue {
    //    the object of linkedList is created with reference of Queue. It can be possible because queue implements the linkedList class
//    the linkedlist now has all the properties of queue.
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(23);
        queue.offer(14);
        queue.offer(16);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
    }


}
