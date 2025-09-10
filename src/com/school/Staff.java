package com.School;

public class Staff extends Person {
    private String role;

    // Constructor
    public Staff(String name, String role) {
        super(name);
        this.role = role;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Staff Role: " + role + ", Role: Staff");
    }
}