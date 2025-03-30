package com.poc.techm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        Employee emp1=new Employee(101,"Mbcd");
        Employee emp2=new Employee(103,"Sde");
        Employee emp3=new Employee(105,"Rfg");
        Employee emp4=new Employee(102,"Pcd");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        /*Collections.sort(empList, Comparator.comparing(Employee::getName));
        for (Employee emp: empList){
            System.out.println(emp.getId()+" : "+emp.getName());
        }*/
        empList.sort(new NameComparator());
        System.out.println(empList);
    }
}
