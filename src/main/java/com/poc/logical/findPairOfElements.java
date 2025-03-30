package com.poc.logical;

import java.util.Arrays;

public class findPairOfElements {

    public static void main(String[] args) {
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
    }

    private static void findThePairs(int[] inputArray, int number) {

        int i=0;
        int j=inputArray.length-1;
        Arrays.sort(inputArray);
        System.out.println("Pair of elements are !");
        while (i<j){
            if (inputArray[i]+inputArray[j]==number){
                System.out.println("("+inputArray[i]+","+inputArray[j]+")");
                i++;
                j--;
            }
            else if (inputArray[i]+inputArray[j]<number){
                i++;
            }
            else if (inputArray[i]+inputArray[j]>number){
                j--;
            }
        }
    }
}
