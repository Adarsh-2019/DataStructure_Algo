package com.poc.techm;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 1, 9, 10, 5};
        int[] ints = removeDuplicate(array);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] removeDuplicate(int[] array) {
        int length = array.length;
        if (length == 0 || length == 1) {
            return array;
        }
        // Count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                array[uniqueCount++] = array[i];
            }
        }
        // Resize array to remove duplicate elements
        int[] uniqueArray = new int[uniqueCount];
        System.arraycopy(array, 0, uniqueArray, 0, uniqueCount);
        return uniqueArray;
    }
}
