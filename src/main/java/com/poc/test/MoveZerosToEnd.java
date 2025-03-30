package com.poc.test;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        moveZerosToEnd(new int[]{12, 0, 7, 0, 8, 0, 3});
    }

    private static void moveZerosToEnd(int[] inputArray) {

        int counter = 0;
        int len=inputArray.length;
        for (int i = 0; i < len; i++) {
            if (inputArray[i] != 0) {
                inputArray[counter] = inputArray[i];
                counter++;
            }
        }
        while (counter<len){
            inputArray[counter]=0;
            counter++;
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
