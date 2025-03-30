package com.poc.test;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 3, 7, 8, 6};
        int number = 8;
        findNumber(array,number);
    }

    private static void findNumber(int[] array, int number) {
        int sumOfAllNumber=(number*(number+1))/2;
        int sum=0;
        int missingNumber=0;
        for (int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
       missingNumber=sumOfAllNumber-sum;
        System.out.println("Missing Number is: "+missingNumber);
    }
}
