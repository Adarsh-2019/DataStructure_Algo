package com.poc.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 5};
        int[] integers = insertionSort(arr);
        for (int n : integers) {
            System.out.print(n + " ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}
