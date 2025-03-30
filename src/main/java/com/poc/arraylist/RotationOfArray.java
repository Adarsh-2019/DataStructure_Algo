package com.poc.arraylist;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8};
        int position = 3;
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        rotation(arr, position);
    }

    private static void rotation(int[] arr, int position) {
        int temp = 0;

        for (int i = 0; i < position; i++) {
            temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
            System.out.println("Input Array After Left Rotation By " + (i+1) + " Positions :");
            System.out.println(Arrays.toString(arr));
        }
    }
}
