package com.poc.techm;

import java.util.HashSet;
import java.util.Set;

public class FindUnionFromTwoArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 2, 7, 8};

        //output
        int[] ints = unionTwoArray(array1, array2);

        for (int num:ints){
            System.out.print(num+" ");
        }
    }

    private static int[] unionTwoArray(int[] array1, int[] array2) {

        Set<Integer>  set=new HashSet<>();

        //add array1 elements in set
        for (int num : array1){
            set.add(num);
        }

        //add array2 elements in set
        for (int n:array2){
            set.add(n);
        }

        //convert set to array
        int[] union=new int[set.size()];
        int i=0;
        for (int number:set){
            union[i++]=number;
        }
        return union;
    }
}
