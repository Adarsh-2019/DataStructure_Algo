package com.poc.producerconsumer;

public class MultithreadingEvenOdd implements Runnable{
 Object object;

 public MultithreadingEvenOdd(Object object){
     this.object=object;
 }
 static int i=0;
    @Override
    public void run() {

        while (i<=10){
            if(i%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;

                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (i%2!=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        Runnable th1=new MultithreadingEvenOdd(arr);
        Runnable th2=new MultithreadingEvenOdd(arr);
        new Thread(th1,"even").start();
        new Thread(th2,"odd").start();

    }
}