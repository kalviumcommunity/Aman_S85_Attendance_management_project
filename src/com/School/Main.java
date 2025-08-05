package com.School;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        // Using setName for initialization
        course course1 = new course();
        course1.setName(201, "Intro to Programming");
        course course2 = new course();
        course2.setName(202, "Linear Algebra");

        student student1 = new student();
        student1.setName(101, "Alice Wonderland");
        student student2 = new student();
        student2.setName(102, "Bob The Builder");

        System.out.println("\nRegistered Students:");
        student1.displayId();
        student2.displayId();

        System.out.println("\nAvailable Courses:");
        course1.displayId();
        course2.displayId();

        System.out.println("\n--- Additional Student and Course ---");
        student student3 = new student();
        student3.setName(103, "Charlie Chaplin");

        course course3 = new course();
        course3.setName(203, "Data Structures");

        System.out.println("New Student: ");
        student3.displayId();
        System.out.println("New Course: ");
        course3.displayId();

        System.out.println("\nSession 3: setName Initialization Complete.");
    }
}
