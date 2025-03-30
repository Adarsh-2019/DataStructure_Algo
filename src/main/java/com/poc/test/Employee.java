package com.poc.test;

public class Employee {
    private long salary;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(long salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}