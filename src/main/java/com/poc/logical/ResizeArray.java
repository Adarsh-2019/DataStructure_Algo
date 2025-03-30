package com.poc.logical;

public class ResizeArray {

    public static int[] resizeArray(int arr[], int capacity)
    {
        int[] temp=new int[capacity];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }

    public static void main(String[] args) {
      int[] arr={2,4,5,6};
      int capacity=10;
        System.out.println("Original Array size is: "+arr.length);
        int[] array = resizeArray(arr, capacity);
        System.out.println("Resize array size is :"+array.length);
        /*for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }*/

    }
}
