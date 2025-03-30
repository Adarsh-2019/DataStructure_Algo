package com.poc.producerconsumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Company company = new Company();
        Producer_class producer = new Producer_class(company);
        Consumer_Class consumer = new Consumer_Class(company);
        producer.start();
        consumer.start();
    }
}
