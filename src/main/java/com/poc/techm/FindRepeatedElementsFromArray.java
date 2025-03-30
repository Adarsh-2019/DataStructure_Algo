package com.poc.techm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindRepeatedElementsFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 1, 9, 10, 5};
        findRepeatedNumber(array);
    }

    private static void findRepeatedNumber(int[] array) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:entries){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" = "+entry.getValue());
            }
        }
    }
}
