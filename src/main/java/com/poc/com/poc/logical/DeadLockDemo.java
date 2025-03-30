package com.poc.com.poc.logical;

public class DeadLockDemo {

    public static void main(String[] args) {
        final Object resource1="This is resource one";
        final Object resource2="This is resource two";
        //t1 try to lock resource1 and then resource2
        Thread t1= new Thread(() -> {
            synchronized (resource1){
                System.out.println("Thread 1 : Locked Resource 1");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (resource2){
                System.out.println("Thread 2 : Locked Resource 2");
            }
        });

        Thread t2= new Thread(() -> {
            synchronized (resource2){
                System.out.println("Thread 2 : Locked Resource 2");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (resource1){
                System.out.println("Thread 1 : Locked Resource 1");
            }
        });
        t1.start();
        t2.start();
    }
}
