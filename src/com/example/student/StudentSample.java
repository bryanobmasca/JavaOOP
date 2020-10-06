package com.example.student;
import model.Student;

public class StudentSample {
    public static void main(String[] args) {
        Student student  = new Student("Bryan",24, "Male", 100620);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("ID No.: " + student.getIdNo());
        student.setName("Bernard");
        System.out.println("Updated Name: " + student.getName());
    }
}
