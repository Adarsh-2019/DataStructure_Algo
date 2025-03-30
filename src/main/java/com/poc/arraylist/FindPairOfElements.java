package com.poc.arraylist;

import java.util.Arrays;

public class FindPairOfElements {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 9, 10};
        int targetSum = 12;
        findPair(arr,targetSum);
    }

    private static void findPair(int arr[],int n) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]==n){
                System.out.println("("+arr[i]+","+arr[j]+")");
                i++;
                j--;
            }else if(arr[i]+arr[j]>n){
                j--;
            }else if (arr[i]+arr[j]<n){
                i++;
            }
        }
    }
}
