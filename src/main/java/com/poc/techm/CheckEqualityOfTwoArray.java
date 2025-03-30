package com.poc.techm;

import java.util.Arrays;

public class CheckEqualityOfTwoArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 4, 5};
        int[] array2 = {3, 5, 2, 4, 1};
        boolean equals = isEquals(array1, array2);
        if (equals){
            System.out.println("Both are equals");
        }else {
            System.out.println("Both are not equals");
        }

    }

    private static boolean isEquals(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        if (array1.length != array2.length) {
            System.out.println("Both are not equal");
        }
        int i;
            for ( i=0 ; i < array1.length; i++) {
                    if (array1[i]!=array2[i]){
                        return false;
                    }
            }
        return true;
    }
}
