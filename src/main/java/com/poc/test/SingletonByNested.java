package com.poc.test;

public class SingletonByNested {

    private static class SingletonHolder {
        static SingletonByNested instance=new SingletonByNested();
    }
    public static SingletonByNested getInstance(){
        return SingletonHolder.instance;
    }

    private SingletonByNested(){
        System.out.println("Object Created");
    }
}
