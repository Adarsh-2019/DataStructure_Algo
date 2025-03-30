package com.poc.producerconsumer;

public class Consumer_Class extends Thread{
    private Company company;

    public Consumer_Class(Company company){
        this.company=company;
    }
    public void run() {

        while (true) {
            try {
                this.company.consumer_item();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
