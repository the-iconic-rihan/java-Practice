package com.company;

import java.util.Objects;

public class student {
    String name;
    int RollNo;

    public student(String name, int RollNo) {
        this.name = name;
        this.RollNo = RollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ",RollNo=" + RollNo + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return RollNo == student.RollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RollNo);
    }
}
