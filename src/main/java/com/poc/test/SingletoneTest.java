package com.poc.test;

import com.poc.test.SingletonByNested;

public class SingletoneTest {
    public static void main(String[] args) {
        //System.out.println(Singltone.getInstance().hashCode());
        //System.out.println(Singltone.getInstance().hashCode());

        System.out.println(SingletonByNested.getInstance().hashCode());
        System.out.println(SingletonByNested.getInstance().hashCode());

    }
}
