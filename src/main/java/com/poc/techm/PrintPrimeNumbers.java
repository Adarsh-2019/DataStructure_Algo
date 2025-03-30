package com.poc.techm;

import java.util.stream.IntStream;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        //traditional method
        //printPrimeNumbers();

        //using java 1.8
        printPrimeNumbersUsing();
    }

    private static void printPrimeNumbersUsing() {
        IntStream.rangeClosed(100, 500)
                .filter(n -> n > 1 && IntStream.rangeClosed(2, n/2).allMatch(i -> n % i != 0))
                .forEach(System.out::println);
    }

    private static void printPrimeNumbers() {
        int start = 100;
        int end = 500;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Counts are " + count);
    }

    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
