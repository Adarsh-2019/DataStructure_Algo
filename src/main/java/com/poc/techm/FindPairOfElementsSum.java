package com.poc.techm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindPairOfElementsSum {
    public static void main(String[] args) {
        int inputArray[] = {2, 4, 5, 3, 0, 7};
        int digit = 7;
        //findPairElements(inputArray, digit);

        //using java 1.8
        IntStream.range(0,inputArray.length).boxed()
                .flatMap(i->IntStream.range(i+1,inputArray.length).filter(j->inputArray[i]+inputArray[j]==digit)
                        .mapToObj(j->"("+inputArray[i]+","+inputArray[j]+")"))
                .forEach(System.out::println);
    }

    private static void findPairElements(int[] inputArray, int digit) {

        Arrays.sort(inputArray);
        int start = 0;
        int end = inputArray.length - 1;
        while (start < end) {
            if (inputArray[start] + inputArray[end] == digit) {
                System.out.println("(" + inputArray[start] + "," + inputArray[end] + ")");
                start++;
                end--;
            } else if (inputArray[start] + inputArray[end] > digit) {
                end--;
            } else {
                start++;
            }
        }
    }
}
