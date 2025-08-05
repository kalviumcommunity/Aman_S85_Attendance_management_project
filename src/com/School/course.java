package com.School;

public class course {
    private static int nextCourseIdCounter = 101;

    int courseId;
    String courseName;

    // Default constructor
    public course() {
        // Allows creating object first, setting later with setName
    }

    // Constructor with name (auto-ID)
    public course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Method to manually set ID and name
    public void setName(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Display method (same as student for consistency)
    public void displayId() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }

    // Optional: Keep displayDetails for flexibility
    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}
