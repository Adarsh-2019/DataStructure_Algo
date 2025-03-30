package com.poc.logical;

public class FindMinValueFromArray {

    public static int findMin(int[] number) {
        int min = number[0];
        for (int i : number) {
            if (i<min){
                min=i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
    int[] arr ={2,1,4,5,3,9,6};
        System.out.println("Min value is : "+findMin(arr));
    }
}
