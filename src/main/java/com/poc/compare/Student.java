package com.poc.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //sort by Id
    @Override
    public int compareTo(Student s) {
        if (id==s.getId()){
            return 0;
        }else if(id>s.getId()){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student1=new Student(101,"Roshan");
        Student student2=new Student(103,"Bushan");
        Student student3=new Student(100,"Tashan");
        Student student4=new Student(101,"Asha");

        List<Student> list=new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list,new IdComparator());
        System.out.println(list);
    }
}
