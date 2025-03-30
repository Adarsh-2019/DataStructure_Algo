package com.poc.arraylist;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int arr[]={12,21,32,-123,19,24,81,90,76,88,78};
        findNumbers(arr);
    }

    private static void findNumbers(int[] arr) {
        int max=arr[0];
        int min=arr[0];

        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
