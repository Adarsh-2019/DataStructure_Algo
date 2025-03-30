package com.poc.techm;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId()==o2.getId()){
            return o1.getName().compareTo(o2.getName());
        }else if (o1.getId()>o2.getId()){
            return 1;
        }else {
            return -1;
        }
    }
}
