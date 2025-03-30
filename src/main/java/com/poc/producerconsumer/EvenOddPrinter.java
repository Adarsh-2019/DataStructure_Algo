package com.poc.producerconsumer;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrinter {
    private static Object obj = new Object();

    private static IntPredicate conditionEven = e -> e % 2 == 0;
    private static IntPredicate conditionOdd = e -> e % 2 != 0;

    private static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1, 10).filter(condition).forEach(EvenOddPrinter::execute);
    }

    public static void execute(int i) {
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName() + " :" + i);
            obj.notify();
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(conditionEven));
        CompletableFuture.runAsync(() -> EvenOddPrinter.printNumber(conditionOdd));
        Thread.sleep(1000);
    }
}
