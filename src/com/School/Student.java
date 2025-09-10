package com.School;

public class student {
    private static int nextStudentIdCounter = 1;

    int studentId;
    String name;

    // Default constructor
    public student() {
        // Allows creating object first, setting later with setName
    }

    // Constructor with name (auto-ID)
    public student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Method to manually set ID and name
    public void setName(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Display method (same naming as Main expects)
    public void displayId() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }

    // Optional: Keep displayDetails() for flexibility
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
