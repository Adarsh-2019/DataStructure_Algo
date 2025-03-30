package com.poc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastCollection {
    public static void main(String[] args) {
        //List<String> list=new ArrayList<>();
        List<String> list=new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            list.add("c");
        }
    }
}
