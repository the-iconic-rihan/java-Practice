package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
//        Creating an instance of stack class using collection interface of type string.
        Stack<String> animals = new Stack<>();
        animals.push("Lions");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.search("Dog"));
        System.out.println(animals.empty());
        System.out.println(animals);


    }
}
