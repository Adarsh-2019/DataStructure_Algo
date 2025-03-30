package com.poc.producerconsumer;

public class Producer_class extends Thread {
    private Company company;

    public Producer_class(Company company) {
        this.company = company;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                this.company.producer_item(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
