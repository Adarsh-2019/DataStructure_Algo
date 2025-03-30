package com.poc.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomArraylist extends ArrayList{

    @Override
    public boolean add(Object obj) {
        if (this.contains(obj)){
            return true;
        }else {

            return super.add(obj);
        }
    }

    public static void main(String[] args) {
        List<String> list=new CustomArraylist();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        System.out.println(list);
    }
}
