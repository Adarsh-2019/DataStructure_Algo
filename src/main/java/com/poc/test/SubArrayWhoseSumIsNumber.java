package com.poc.test;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
    public static void main(String[] args) {
        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
    }

    private static void findSubArray(int[] inputArray, int number) {
        int sum = inputArray[0];
        int start = 0;
        for (int i = 1; i < inputArray.length; i++) {
            sum=sum+inputArray[i];

            while (sum > number && start <= i - 1) {
            sum=sum-inputArray[start];
            start++;
            }
        if (sum==number) {
            System.out.println("Continuous sub array  :"+ Arrays.toString(inputArray));
            for (int j=start;j<=i;j++){
                System.out.println(inputArray[j]+" ");
            }
         }
        }
    }
}
