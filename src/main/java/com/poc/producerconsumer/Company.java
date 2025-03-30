package com.poc.producerconsumer;

public class Company {
    private int n;
    private boolean flag=false;

    //flag=false  producer
    //flag=true consumer
    public synchronized  void producer_item(int n) throws InterruptedException {
        if (flag){
            wait();
        }
        this.n=n;
        System.out.println("Producer :"+this.n);
        flag=true;
        notify();
    }

    public synchronized int consumer_item() throws InterruptedException {
        if (!flag){
            wait();
        }
        System.out.println("Consumer :"+this.n);
        flag=false;
        notify();
       return this.n=n;
    }
}
