package com.poc.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class FailFastFailSafeExample {
    public static void main(String[] args) {
        Map<Integer,String> hashTable=new Hashtable<>();
        hashTable.put(1,"One");
        hashTable.put(2,"Two");
        hashTable.put(3,"Three");

        Iterator<Integer> keySet = hashTable.keySet().iterator();
        while (keySet.hasNext()){
            Integer key = keySet.next();
            System.out.println(hashTable);
            //hashTable.put(4,"Four");
        }

        /*Map<Integer,String> hashMap=new ConcurrentHashMap<>();
        hashMap.put(1,"One");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println(hashMap.get(key));
            hashMap.put(4,"Four");
        }*/
    }
}
