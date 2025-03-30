package com.poc.test;

public class Sorting {
    public static void main(String[] args) {
    int arr[]={1,5,3,7,8,2};
        int[] arrays = sortArray(arr);
        for (int i:arrays){
            System.out.println(i+" ");
        }
    }

    private static int[] sortArray(int[] arr) {
     boolean isSwap;
        for (int i=0; i<arr.length-1;i++) {
            isSwap=false;
            for (int j =0; j < arr.length-1-i; j++) {
                if (arr[j] >arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap=true;
                }
            }
            if (!isSwap){
                break;
            }
        }
        return arr;
    }
}
