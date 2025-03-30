package com.poc.techm;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestMain {
    public static void main(String[] args) {
        /*try {
            Class<Boolean> clazz = boolean.class;
            clazz.newInstance(); // Attempting to create an instance of a primitive type
        } catch (InstantiationException ie) {
            ie.printStackTrace();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        }*/
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       /* String str = null;
        int i = Integer.parseInt(str);
        System.out.println(i);*/
       /* Integer integer = Integer.valueOf(null);
        System.out.println(integer);*/
       /* Map<String,Integer > map=new ConcurrentHashMap<>();
        map.put("B",6);
        map.put("A",2);
        map.put("C",1);
        map.put("E",7);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry:entries){
            System.out.println(entry);
            map.remove("E",7);
        }*/
        /*Set set=new HashSet();
        System.out.println(set.add(1));
        System.out.println(set.add(10));
        System.out.println(set.add(1));*/

        String str="jkhkj";
        //System.out.println(Objects.requireNonNull(str,"object should not be null"));
        Optional<Object> optional = Optional.ofNullable(str);
        //System.out.println(optional);

        /*StringBuffer buffer=new StringBuffer(str);
        buffer.append("abc");
        System.out.println(buffer);*/
        /*Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        System.out.println(i1==i2);*/

       /* Object obj="obje";
        if (obj instanceof String) {
            String i = (String) obj;
            System.out.println("Hey");
        }else {
            System.out.println("hello");
        }*/

       /* Number num=1321;
        if (num instanceof Integer){
            Integer i=(Integer) num;
            System.out.println("Hey");
        }else {
            System.out.println("hello");
        }
*/
    }
}
