package com.poc.logical;

public class FindSecondMax {
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {12, 33, 44, 21, 10, 56, 26};
        System.out.println(secondMax(arr));
    }
}
