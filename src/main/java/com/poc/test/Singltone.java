package com.poc.test;

public final class Singltone {
    private static Singltone INSTANCE = null;

    private Singltone(){
    }
    public static Singltone getInstance(){
        if (INSTANCE==null){
            synchronized (Singltone.class){
                if (INSTANCE==null){
                    INSTANCE=new Singltone();
                }
            }
        }
        return INSTANCE;
    }
}
