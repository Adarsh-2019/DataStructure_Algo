package com.poc.arraylist;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 9, 10,40};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>secondMax){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Second Highest Number: "+secondMax);
    }
}