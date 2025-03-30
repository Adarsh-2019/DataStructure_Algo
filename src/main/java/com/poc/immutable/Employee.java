package com.poc.immutable;

import java.util.*;
import java.util.stream.Collectors;

public final class Employee {

    private final String name;
    private final Date doj;
    private final List<String> mobile;
    private final Address address;

    public Employee(String name, Date doj, List<String> mobile, Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
    }

    public Address getAddress() {
        return new Address(address.getCity(),address.getZip());
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        //return new Date();
        return (Date) doj.clone();
    }

    public List<String> getMobile() {
       // return new ArrayList<>(mobile);
        return Collections.unmodifiableList(mobile);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }


    public static void main(String[] args) {
        Date date=new Date();
        Address address=new Address();
        address.setCity("blk");
        address.setZip("1234");
        Employee employee=new Employee("Ram",date,
                Arrays.stream(new String[]{"121212","4545454"}).collect(Collectors.toList()),address);
        employee.getDoj().setDate(29);
        employee.getAddress().setCity("Vns");
        //employee.getMobile().add("87879");
        System.out.println(employee);
    }

}
