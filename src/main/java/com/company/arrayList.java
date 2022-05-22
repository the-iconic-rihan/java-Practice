package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
//        using the Object class to create the array List of Particular type.
//        Integer | String | Float | Boolean etc.
        ArrayList<Integer> list = new ArrayList<>();

//        Adding elements.
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

//        get elements
        int elements = list.get(1);
        System.out.println(elements);

//        adding element in between
        list.add(2, 6);
        System.out.println(list);
        list.set(0, 3);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
//        size of array
        System.out.println(list.size());

//        sorting of arraylist using Collection.sort
        Collections.sort(list);
        System.out.println(list);




    }
}
