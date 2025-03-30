package com.poc.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaLogical {
    /*public static void main(String[] args) {
        *//*List<Integer> itemsList = Arrays.asList(10, 12, 10, 33, 40, 40, 61, 61);
        Set<Integer> newList=new HashSet<>();
        itemsList.stream().filter(nums->!newList.add(nums)).forEach(System.out::println);
        //itemsList.stream().distinct().forEach(System.out::println);*//*

        List<Integer>  integerList=Arrays.asList(1,2,3,4,6,7,8,9,10);

        int missingNumber = findMissingNumber(integerList);
        System.out.println(missingNumber);
    }*/

    public static void main(String[] args) {
        List<Integer> itemsList = Arrays.asList(10, 12, 13, 33, 56, 40, 69, 61);
    }

    public static int findMissingNumber(List<Integer> numbers) {
        int maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        List<Integer> allNumbers = IntStream.rangeClosed(1, maxNumber)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> missingNumbers = allNumbers.stream()
                .filter(n -> !numbers.contains(n))
                .collect(Collectors.toList());

        return missingNumbers.get(0);
    }
}
