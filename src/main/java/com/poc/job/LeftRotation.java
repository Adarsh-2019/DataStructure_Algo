package com.poc.job;

public class LeftRotation {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = 2;
        int[] ints = leftRotationArray(arr, n);
        for(int i:ints){
            System.out.println(i);
        }
    }

    public static int[] leftRotationArray(int[] arr, int n) {
       int d=arr.length;
       int[] temp=new int[d];

       for (int i=0;i<d;i++){
           temp[i]=arr[i];
       }

        // Shift the rest of the array
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy temp back to the end of the array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
        return arr;
    }
}
