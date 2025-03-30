package com.poc.logical;

public class RemoveEvenFromArray {

    public static int[] removeEven(int[] array) {
        int oddCount = 0;

        for (int j : array) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }
        int[] results = new int[oddCount];
        int idx = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                results[idx] = j;
                idx++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 8, 10, 5, 12};
        int[] oddElements = removeEven(array);
        for (int oddElement : oddElements) {
            System.out.println(oddElement);
        }
    }

    /*
    public static int[] removeEven(int[] array) {
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] results = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                results[idx] = array[i];
                idx++;
            }
        }
        return results;
    }
     */
}
