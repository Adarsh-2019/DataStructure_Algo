package com.poc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
    public static void main(String[] args) {
        List<String> originalList=new ArrayList<>();

        originalList.add("John");
        originalList.add("Carlos");
        originalList.add("David");
        originalList.add("Ian");
        originalList.add("Daniel");
        //Printing originalList

        System.out.println("=========== Original List ===========");
        System.out.println(originalList);

        List<String> unmodifiableList = Collections.unmodifiableList(originalList);
        unmodifiableList.add("Black");

        System.out.println("=========== Read only list ===========");
        System.out.println(unmodifiableList);
    }
}
