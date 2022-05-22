package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
//        Creating an instance of stack class using collection interface of type string.
        Stack<String> animals = new Stack<>();

//        adding elements in stack
        animals.push("Lions");
        animals.push("Tiger");
        animals.push("Dog");
        animals.push("Cat");
//        peek function return the last element of the stack
        System.out.println(animals.peek());
//        pop function deletes the last element of the stack
        System.out.println(animals.pop());
//        searching within the stack
        System.out.println(animals.search("Dog"));
//        return boolean value if the stack is empty or not
        System.out.println(animals.empty());
        System.out.println(animals);


    }
}
