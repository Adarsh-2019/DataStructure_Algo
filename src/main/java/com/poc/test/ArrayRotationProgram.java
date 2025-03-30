package com.poc.test;

import java.util.Arrays;

public class ArrayRotationProgram {
    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    private static void leftRotate(int[] inputArrays, int position) {
        System.out.println("Input Array are :");
        System.out.println(Arrays.toString(inputArrays));
        int temp = 0;

        for (int i = 0; i < position; i++) {
            temp = inputArrays[0];
            for (int j = 0; j < inputArrays.length - 1; j++) {
                inputArrays[j] = inputArrays[j + 1];
            }
            inputArrays[inputArrays.length - 1] = temp;
            System.out.println("Input Array After Left Rotation By " + (i+1) + " Positions :");
            System.out.println(Arrays.toString(inputArrays));
        }
    }
}