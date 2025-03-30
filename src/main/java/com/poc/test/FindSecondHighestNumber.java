package com.poc.test;

import java.util.Arrays;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        getSecondHighestElement(new int[]{17, 11, 23, 64, 41, 88, 35});
    }

    private static void getSecondHighestElement(int[] inputArray) {
        int max = inputArray[0];
        int secondMax = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                secondMax = max;
                max = inputArray[i];
            } else if (inputArray[i] > secondMax && inputArray[i] != max) {
                secondMax = inputArray[i];
            }
        }
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Max: " + max);
        System.out.println("Second max: " + secondMax);
    }
}
