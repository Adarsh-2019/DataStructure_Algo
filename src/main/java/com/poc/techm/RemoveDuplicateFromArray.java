package com.poc.techm;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 1,2};

        /*
        HashSet<Integer> set=new HashSet<>();
        int[] ints = Arrays.stream(array).filter(set::add).toArray();
        System.out.println(Arrays.toString(ints));
        */

        int[] uniqueElements = removeDuplicate(array);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private static int[] removeDuplicate(int[] input) {
        Arrays.sort(input);
        int[] array = new int[input.length];
        int j = 0;
        for (int i = 0; i < input.length-1; i++) {
           if (input[i]!=input[i+1]){
               array[j++]=input[i];
           }
        }
        array[j++]=input[input.length-1];
        array = Arrays.copyOf(array, j);
        return array;
    }
}
