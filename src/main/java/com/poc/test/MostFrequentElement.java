package com.poc.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentElement {
    public static void main(String[] args) {
        getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6, 7});
    }

    private static void getMostFrequentElement(int[] inputArray) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : inputArray) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int element = 0;
        int frequency = 1;

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > frequency) {
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }
        if (frequency>1){
            System.out.println("Input Array : "+ Arrays.toString(inputArray));
            System.out.println("The most frequent element : "+element);
            System.out.println("Its frequency : "+frequency);
        }else {
            System.out.println("Input Array : "+Arrays.toString(inputArray));
            System.out.println("No frequent element. All elements are unique.");
        }
    }
}
