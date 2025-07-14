package com.School;

class student{
    int id;
    String name;

    public void setName(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayId(){
        System.out.println("Student id "+this.id+", Name: "+this.name);

    }

};
