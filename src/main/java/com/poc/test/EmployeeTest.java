package com.poc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employeeList=new ArrayList<>();

        Employee emp1=new Employee(12000,"Rahul",27);
        Employee emp2=new Employee(15000,"Ajay",30);
        Employee emp3=new Employee(10000,"John",31);
        Employee emp4=new Employee(20000,"Black",29);
        Employee emp5=new Employee(18000,"Smith",35);

       /* employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
*/
        //get>30, them their salary will be increase 10% on the top existing ;
        List<Double> collect = employeeList.stream().filter(emp -> emp.getAge() > 30).map(emp -> emp.getSalary() + emp.getSalary() * 0.1).collect(Collectors.toList());
        //System.out.println(collect);
    }
}
