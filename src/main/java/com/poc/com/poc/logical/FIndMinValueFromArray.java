package com.poc.com.poc.logical;

public class FIndMinValueFromArray {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6,-1};

        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int min = findMinimum(arr);
        System.out.println("Minimum in the Array: " + min);
    }

    public static int findMinimum(int[] arr) {
        int minValue = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] < minValue){
               minValue=arr[i];
            }
        }
        return minValue;
    }
}
