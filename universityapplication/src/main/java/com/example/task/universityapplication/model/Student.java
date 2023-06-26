package com.example.task.universityapplication.model;

public class Student {
    private String name;
    private int EnrolementNo;


    public Student() {

    }

    public Student(String name, int enrolementNo) {
        this.name = name;
        this.EnrolementNo = enrolementNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrolementNo() {
        return EnrolementNo;
    }

    public void setEnrolementNo(int enrolementNo) {
        EnrolementNo = enrolementNo;
    }
}
