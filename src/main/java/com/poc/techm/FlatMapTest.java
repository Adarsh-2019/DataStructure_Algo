package com.poc.techm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
    public static void main(String[] args) {
        /*
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> lists = Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
        //List<Integer> collect = lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        List<Integer> collect = lists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(collect);
       */
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

    }
}
