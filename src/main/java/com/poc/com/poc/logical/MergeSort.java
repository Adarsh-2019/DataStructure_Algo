package com.poc.com.poc.logical;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = {87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150};
        int start = 0;
        int end = input.length - 1;
        mergeSort(input, start, end);
        System.out.println(Arrays.toString(input));
    }

    private static void mergeSort(int[] input, int start, int end) {

        int mid = (start + end) / 2;
        if (start < end) {
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
        }

        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }

        while (first <= mid) {
            tmp[i++] = input[first++];
        }

        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }
}
