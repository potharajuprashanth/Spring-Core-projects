package com.naresh;

public class Student {  // Corrected the class name from 'Stduent' to 'Student'
    int id = 101;
    String name = "Virat Kohli";

    public Student() {  // Updated the constructor as well
        System.out.println("Student Created.....");
    }

    public void printStudentInfo() {
        System.out.println("Name is: " + name);
        System.out.println("Id is: " + id);
    }
}
