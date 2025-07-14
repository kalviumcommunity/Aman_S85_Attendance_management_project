package com.School;

import com.School.course;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Attendance System Project!");
        System.out.println("Session 1: Project Setup and Orientation Complete.");
        course[] course2 = new course[1];
        course2[0] = new course();

        course2[0].setName(101, "Mohit");
        System.out.println("Student Details");
        for (course s : course2) {
            s.displayId();
            System.out.println();
        }
        student[] student1 = new student[1];
        student1[0] = new student();

        student1[0].setName(101, "Mohit");
        System.out.println("Student Details");
        for (student s : student1) {
            s.displayId();
            System.out.println();
        }
    }
}