package com.poc.techm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.function.Function;

public class FindLargestAndSmallestNumber {
    public static void main(String[] args) {
        int[] array = {11, 22, 90, 87, 98, 45, 37, 57};
        //int[] array={-11,-33,-1,-44,-10,-98,-100};
        //findSmallestAndLargest(array);
        int i = Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
        System.out.println(i);
    }

    private static void findSmallestAndLargest(int[] array) {

        int smallest = array[0];
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest>array[i]){
                smallest=array[i];
            }else if(largest<array[i]){
                 largest=array[i];
            }
        }
        System.out.println("Largest number :"+largest+"  "+"Smallest number :"+smallest);
    }
}
