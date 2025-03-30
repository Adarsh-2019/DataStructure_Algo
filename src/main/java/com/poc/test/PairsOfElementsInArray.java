package com.poc.test;

import java.util.Arrays;

public class PairsOfElementsInArray {
    public static void main(String[] args) {
        int inputArray[] = {2, 4, 5, 3, 0, 7};
        int digit = 7;
        findPair(inputArray, digit);
    }

    private static void findPair(int[] inputArray, int digit) {

        Arrays.sort(inputArray); //{0,2,3,4,5,7,9}
        int i = 0;
        int j = inputArray.length - 1;
        while (i < j) {
            if (inputArray[i] + inputArray[j] == digit) {
                System.out.println("(" + inputArray[i] + "," + inputArray[j] + ")");
                i++;
                j--;
            } else if (inputArray[i] + inputArray[j] > digit) {
                j--;
            } else if (inputArray[i] + inputArray[j] < digit) {
                i++;
            }
        }
    }
}
