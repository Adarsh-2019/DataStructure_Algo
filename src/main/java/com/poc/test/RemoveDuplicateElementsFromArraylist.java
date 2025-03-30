package com.poc.test;

import java.util.*;

public class RemoveDuplicateElementsFromArraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Abc");
        list.add("Bcd");
        list.add("Abc");
        list.add("Bcd");

        String[] strings = list.toArray(new String[0]);
        int count = 0;
        for (String str : strings) {
          /* if (list.contains(str)){
               count++;
        }*/
        }
    }
}
