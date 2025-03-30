package com.poc.com.poc.logical;

import java.util.Arrays;

public class PairsOfElementsInArray {
    static void findThePairs(int inputArray[], int inputNumber) {
        //Sorting the given array
        Arrays.sort(inputArray);
        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");

        int i = 0;
        int j = inputArray.length - 1;
        //Till i crosses j, perform the following task
        while (i < j) {
            if (inputArray[i] + inputArray[j] == inputNumber) {
                System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                i++;
                j--;
            }

            //If inputArray[i]+inputArray[j] is smaller than inputNumber
            else if (inputArray[i] + inputArray[j] < inputNumber) {
                i++;
            }
            //If inputArray[i]+inputArray[j] is greater than inputNumber
            else if (inputArray[i] + inputArray[j] > inputNumber) {
                j--;
            }
        }
    }
    public static void main(String[] args) {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
    }
}

