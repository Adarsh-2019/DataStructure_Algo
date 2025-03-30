package com.poc.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMapCollection {
    public static void main(String[] args) {
        //Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> map=new ConcurrentHashMap<>();
        map.put(1,"one");
        map.put(2,"two");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
            map.put(3,"three");
        }
    }
}
