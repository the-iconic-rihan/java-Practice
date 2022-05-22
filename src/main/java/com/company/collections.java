package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class ll {

}

public class collections {
    /*   list Interface
      consist of 1] ArrayList 2] List 3] Vector 4] LinkedList

      Queue Interface
      1] Priority Queue 2] LinkedList 3] Deque --> ArrayQueue

      Set Interface
      1] Hashset  2] LinkedList Hash Set 3] SortedSet --> TreeSet.

      Map Interface
      1] HashMap 2] LinkedHash Map  3] Sorted Map --> TreeMap 4] Hash table

      linkedList --> Singular LinkedList
                  --> Double  LinkedList
                  --> Circular LinkedList
      */
    Node head;
    private int size;

    collections() {
        size = 1;

    }

    public static class Node {
        String data; //data to be store in linkedlist
        Node next; //the reference of the next node of type node.

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.data = data;
        newNode.next = head;

        head = newNode;
        size++;
    }

    //addLast
    public void addLast(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head; //creating a temp pointer gor traversing the linkedklist.\
        while (currNode.next != null) {
//            if the next vaklue is not null please update the currNode.next further
            currNode = currNode.next;
        }
        newNode.data = data;
        currNode.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("the lis t is empty. ");

        } else {
            head = this.head.next;
            size--;
        }
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty. ");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;


    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
            }
            System.out.println("Null");

        }

    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        //add -first , last
//        first --> adding the node at starting of the linkedList.
//        last --> Adding the node at the end of linked list.
        collections list = new collections();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Arraylist = new ArrayList<>();
 //        for (int i = 0; i < Arraylist.size(); i++) {
//            Arraylist.add(in.);
//        }
       /* list.addLast("list");
        list.AddFirst("this");
        list.addLast("is");
        list.addLast("Rihan");

        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());*/
        LinkedList<String> List = new LinkedList<>();
//        the add function in the list by default add the elements to the last node.
        List.add("This");
        List.add("is");
        List.add("a");
        List.addLast("list");
        System.out.println(List);
        System.out.println(List.size());
        for (String s : List) {
            System.out.print(s + "-->");
        }
        System.out.print("null");
    }
}