package com.poc.techm;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        //fibonacciSeries(n);

        //using java 1.8 version
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int number) {
        Stream.iterate(new int[]{0,1},fab->new int[]{fab[1],fab[0]+fab[1]}).limit(number).map(fa->fa[0])
                .forEach(System.out::println);
    }

    private static void fibonacciSeries(int number) {
        int firstNumber=0;
        int secondNumber=1;
        int thirdNumber;
        for (int i=1;i<=number;i++){
            System.out.println(firstNumber);
            thirdNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
        }
    }
}
