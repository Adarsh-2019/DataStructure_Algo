package com.poc.logical;

public class FindMissingNumber {

    public static int missingNumber(int[] array) {

        int sum = 0;
        int n = array.length + 1;
        sum = (n * (n + 1)) / 2;
        for (int num : array) {
          sum=sum-num;
        }
        return sum;
    }

    public static void main(String[] args) {
     int[] arr={1,3,2,5,6,7,8};
        int number = missingNumber(arr);
        System.out.println(number);
    }
}
