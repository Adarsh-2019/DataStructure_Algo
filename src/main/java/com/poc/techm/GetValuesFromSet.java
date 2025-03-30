package com.poc.techm;

import java.util.HashSet;
import java.util.Set;

public class GetValuesFromSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        /*
        //1.using iterator method
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        */

       /* //2. for-each loop
        for (String str:set){
            System.out.println(str);
        }*/

        /*//converting set toArray
        String[] strings = set.toArray(new String[0]);
        for (String str:strings){
            System.out.println(str);
        }*/

    }
}
