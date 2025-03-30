package com.poc.logical;

public class MoveZeroAtEndsOfArray {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /*
    1.array iterating
    2. set j=0, i=0;
    3.check condition arr[i]!=0 && arr[j]==0
      if true,
               then swap it
       else
        skip it.
     4.again check only j==0,
        if true
            then increase j+1,
        else
        skip increment
     */
    public static void moveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,2, 0, 5, 0, 6, 7, 0};
        moveZero(arr);
        //print(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
