package com.poc.test;

public class Student {
    private int id;
    private String name;

    public void display(){
        System.out.println("id :"+id+" , "+"name :"+name);
    }

    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        student1.display();
        student2.display();
    }
}
