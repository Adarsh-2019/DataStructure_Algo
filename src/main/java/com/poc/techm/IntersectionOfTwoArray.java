package com.poc.techm;

import java.util.Arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 2, 7, 8};
        intersectionTwoArray(array1, array2);
    }

    private static void intersectionTwoArray(int[] array1, int[] array2) {

        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i]<array2[j]){
                i++;
            }else if (array1[i]>array2[j]){
                j++;
            }else {
                System.out.print(array1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
