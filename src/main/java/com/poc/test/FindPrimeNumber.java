package com.poc.test;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int n = 21;
        //IntStream.rangeClosed(2,n).filter(num->num > 1 && IntStream.range(2,num) .noneMatch(i->num%i==0)).forEach(System.out::println);
        IntStream.rangeClosed(2, n).filter(isPrime()).forEach(System.out::println);

    }

    private static IntPredicate isPrime() {
        return num -> num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
    }
}
