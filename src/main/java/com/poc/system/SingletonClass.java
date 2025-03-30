package com.poc.system;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if (instance==null){
            synchronized (SingletonClass.instance){
                if (instance==null){
                    instance=new SingletonClass();
                }
            }
        }
        return instance;
    }
}
