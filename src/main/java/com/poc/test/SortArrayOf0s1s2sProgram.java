package com.poc.test;

import java.util.Arrays;

public class SortArrayOf0s1s2sProgram {
    public static void main(String[] args) {
        sortArray(new int[]{1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0});
    }

    private static void sortArray(int[] inputArray) {
        int countZeros = 0;
        int countOnce = 0;
        int CountTwos = 0;

        //traversing the arrays
        for (int i = 0; i < inputArray.length; i++) {
            //count zeros
            if (inputArray[i] == 0) {
                countZeros++;
            }
            //count ones
            else if (inputArray[i] == 1) {
                countOnce++;
            }
            //count twos
            else if (inputArray[i] == 2) {
                CountTwos++;
            }
        }
        //rewrite 0s
        for (int i = 0; i < countZeros; i++) {
            inputArray[i] = 0;
        }
        //rewrite 1s
        for (int i = countZeros; i < (countZeros + countOnce); i++) {
            inputArray[i] = 1;
        }
        //rewrite 2s
        for (int i = (countZeros + countOnce); i < inputArray.length; i++) {
            inputArray[i] = 2;
        }
        System.out.println("Array after sorting: " + Arrays.toString(inputArray));
    }
}
