package com.poc.logical;

public class ReverseArray {

    public static void reverseArray(int[] number, int start, int end) {
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] number = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = number.length - 1;
        reverseArray(number, start, end);
        printArray(number);
    }
}
