package com.poc.techm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToArrayList {

    public static void main(String[] args) {


       /* int[] array={1,5,2,6,3,8,9};
        //convert Array to ArrayList
        List<Integer> arrayList=new ArrayList<>();
        for (Integer num:array){
            arrayList.add(num);
        }
      //  System.out.println(arrayList);


        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(collect);
        */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int size = list.size();
        int[] array = new int[size];
        int i = 0;
        for (int num : list) {
            array[i++] = num;
        }
        System.out.println(Arrays.toString(array));

        int[] ints = list.stream().mapToInt(Integer::intValue).toArray();
        //System.out.println(Arrays.toString(ints));
    }
}
