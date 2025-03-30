package com.poc.test;

import java.util.Arrays;

public class Array0s1sProgram {
    public static void main(String[] args) {
        sortBinaryArray(new int[] {1, 0, 1, 1, 0, 1, 0, 0});
    }

    private static void sortBinaryArray(int[] inputArray) {
        int zeroCount=0;

        //counting the zeros
        int i;
        for (i = 0; i<inputArray.length; i++){
            if (inputArray[i]!=0){
                zeroCount++;
            }
        }

        //Rewriting the array with 0s...
        for (int k=0;k<zeroCount;k++){
            inputArray[k]=1;
        }
        //Rewriting the array with 1s...
        for (int j=zeroCount;j<inputArray.length;j++){
            inputArray[j]=0;
        }
        System.out.println("Input array after sorting: "+ Arrays.toString(inputArray));
    }
}
