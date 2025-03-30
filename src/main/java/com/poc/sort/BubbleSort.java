package com.poc.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 5};
        int[] ints = mergeSort(arr);
        for (int n : ints) {
            System.out.print(n + " ");
        }
    }

    private static int[] mergeSort(int[] arr) {
        boolean isSwap;
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
                break;
        }
        return arr;
    }
}