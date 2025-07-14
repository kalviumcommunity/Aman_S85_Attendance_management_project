package com.School;

public class course{
    int courseId;
    String courseName;

   public  void setName(int courseId,String courseName){
        this.courseId=courseId;
        this.courseName=courseName;
    }

  public   void displayId(){
        System.out.println("CourseId "+this.courseId+", Name: "+this.courseName);

    }

}
