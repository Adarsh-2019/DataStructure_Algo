package com.poc.test;

import java.util.Arrays;

public class SmallestSecondSmallestElementInArray {
    public static void main(String[] args) {
        getSmallestAndSecondSmallestElement(new int[]{17, 11, 23, 64, 41, 88, 35});
    }

    private static void getSmallestAndSecondSmallestElement(int[] inputArray) {
        int smallestNumber = inputArray[0];
        int secondSmallestNumber = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < smallestNumber) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = inputArray[i];
            } else if (smallestNumber < inputArray[i] && inputArray[i] < secondSmallestNumber) {
                  secondSmallestNumber=inputArray[i];
            }
        }
        System.out.println("Input Array :"+ Arrays.toString(inputArray));
        System.out.println("smallest number: "+smallestNumber);
        System.out.println("Second smallest number: "+secondSmallestNumber);
    }
}
