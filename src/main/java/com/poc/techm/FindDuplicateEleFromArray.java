package com.poc.techm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateEleFromArray {
    public static void main(String[] args) {
        int[] arrays={1, 2, 3, 4, 5, 2, 6, 7, 8, 1, 9, 10, 5};
        //findDuplicate(arrays);

        //using java 1.8
        Arrays.stream(arrays).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    private static void findDuplicate(int[] input) {
        for (int i=0;i<input.length;i++){
            boolean isDuplicate = false;
            for (int j=i+1;j<input.length;j++){
                if (input[i]==input[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (isDuplicate){
                System.out.println(input[i]);
            }
        }
    }
}