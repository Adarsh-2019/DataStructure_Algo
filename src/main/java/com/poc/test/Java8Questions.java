package com.poc.test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Questions {

    public static void main(String[] args) {
     String str="thisisgoodprogramming";
     int arrays[]={2,1,6,8,3,11,44,12,0};
     String stringList[]={"java","python","microservices","spring boot", "up"};

        //find occurrence of the characters
        Map<String, Long> occurrenceOfCharacters = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(occurrenceOfCharacters);

        //find the duplicate characters
        List<String> duplicateCharacters = Arrays.stream(str.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        //System.out.println(duplicateCharacters);

        //find unique characters
        List<String> uniqueCharacters = Arrays.stream(str.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors
                        .counting())).entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        //System.out.println(uniqueCharacters);

        //find first non repeated characters
        String first = Arrays.stream(str.split("")).collect(Collectors
                .groupingBy(Function.identity(), LinkedHashMap::new,Collectors
                        .counting())).entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        //System.out.println("First non repeating char :"+first);

        //find second highest number
        Integer secondHighestNumber = Arrays.stream(arrays).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
       // System.out.println("Second highest number :"+secondHighestNumber);

        //find second lowest number
        Integer secondLowestNumber = Arrays.stream(arrays).boxed().sorted().skip(1).findFirst().get();
        //System.out.println(secondLowestNumber);

        //find longest string from given arrays
        String maxLengthString = Arrays.stream(stringList)
                .reduce((word1, word2) ->
                        word1.length() < word2.length() ? word1 : word2).get();
        //System.out.println(maxLengthString);

        //find number who start with 1
        /*int numberArray[]={012,92,21,19,1,10};
        List<String> collect = Arrays.stream(numberArray).boxed().map(s -> s + "").filter(s->s.startsWith("1")).collect(Collectors.toList());
        //System.out.println(collect);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);*/

       /* Arrays.sort(stringList,(a,b)->Integer.compare(a.length(),b.length()));
        System.out.println(Arrays.toString(stringList));
        System.out.println("+++++++++++++++++++++++++++++++++");
        Arrays.sort(stringList, String::compareTo);
        System.out.println(Arrays.toString(stringList));*/

    }
}
