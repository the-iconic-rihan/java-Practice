package com.company;
// Using a comparator, we can sort the elements based on data members. For instance, it may be on roll no, name, age.


import java.util.ArrayList;
import java.util.Comparator;

class Student {
    int RollNo;
    String Address, name;

    Student(int RollNo, String Address, String name) {
        this.RollNo = RollNo;
        this.Address = Address;
        this.name = name;

    }

    public String toSting() {
        return this.RollNo + " " + this.name + " " + this.Address;
    }
}

//the class with the method to compare with rollno.
class sortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.RollNo - b.RollNo;
    }
}
//the class with the method to compare by name.

class sortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);

    }
}

public class LearnComparator {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "Aurangabad", "Rihan"));
        ar.add(new Student(101, "Nashik", "Gaurav"));
        ar.add(new Student(112, "pune", "pravin"));

        System.out.println("unsorted");
//        itreatring using "get" function of arraylist
        for (Student student : ar) System.out.println(student.toSting() + " ");
//        sorting student entries by roll number
        ar.sort(new sortByRoll());
        System.out.println("\nSorted by roll no:");

        for (Student student : ar) System.out.println(student.toSting());

//        sorting by name
        System.out.println("\nSorted by names : ");
        ar.sort(new sortByName());
        for (Student student : ar) {
            System.out.println(student.toString());
        }


    }
}
