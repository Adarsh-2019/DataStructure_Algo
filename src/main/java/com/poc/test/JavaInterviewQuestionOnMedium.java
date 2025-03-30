package com.poc.test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaInterviewQuestionOnMedium {
    public static void main(String[] args) {

        //1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<Integer> list1 = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        //System.out.println(list1);

        //2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<String> collect = myList.stream().map(s -> s + "").filter(str -> str.endsWith("2")).collect(Collectors.toList());
        //System.out.println(collect);

        //3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
       /* myList2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(ch->ch.getValue()>1).map(Map.Entry::getKey)
                .forEach(System.out::println);*/
        Set<Integer> set = new HashSet<>();
        //myList2.stream().filter(num->!set.add(num)).forEach(System.out::println);

        //4.Given the list of integers, find the first element of the list using Stream functions?
        Integer integer = myList2.stream().findFirst().get();
        //System.out.println(integer);

        //5.Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> listlist = Arrays.asList(77, 11, 10);
        Integer integer1 = listlist.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        //System.out.println(integer1);
        long count = listlist.stream().count();
        //System.out.println(count);
        /*Integer integer2 = listlist.stream().max(Integer::compare)
                .get();
        System.out.println(integer2);*/

        //Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Character character = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
        //System.out.println(character);

        /*
        Set<Map.Entry<Character, Long>> entries = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
        for (Map.Entry<Character,Long> entry:entries) {
            if (entry.getValue()== 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        */
        /*List<Integer> myList12 = Arrays.asList(10,8,49,25,98,32,15);
        myList12.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);*/
        int[] nums = {1, 2, 4, 1, 5, 6, 7, 8, 2, 4, 5, 9};
        boolean b = containsDuplicate(nums);

        // int[] nums={1,2,4,1,5,6,7,8,2,4,5,9};
        //even and odd , even -e and odd-o,
        List<String> collect1 = Arrays.stream(nums).mapToObj(num -> num % 2 == 0 ? num + "-e" : num + "-o").collect(Collectors.toList());
        //System.out.println(collect1);
        //java 1.8 real time interview questions
        //1.Find out the count of male and female employees present in the organization?

        /*Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                // Peeking to print each element before processing
                .peek(System.out::println)
                // Doubling each element
                .map(n -> n * 2)
                // Peeking to print each doubled element before processing
                .peek(System.out::println)
                // Summing all elements
                .reduce(0, Integer::sum);*/
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .peek(System.out::println) // Peek to see intermediate results
                .forEach(System.out::println);*/

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");
        // Create a stream from the names list
        /*
        names.stream()
                // Limit the stream to the first three elements
                .limit(3)
                // Print the elements to the console
                .forEach(System.out::println);
         */

        List<Integer> evenNumbers=Arrays.asList(4,6,8,10);
        List<Integer> oddNumbers= Arrays.asList(9,15,21,25,27);
        List<Integer> prime=Arrays.asList(2,3,5,7,11,13);
        /*
        List<Integer> collect2 = Stream.of(oddNumbers, evenNumbers).flatMap(List::stream).sorted().collect(Collectors.toList());
        System.out.println(collect2);
        */
        List<Integer> collect2 = Stream.of(evenNumbers, oddNumbers, prime).flatMap(Collection::stream).sorted().collect(Collectors.toList());
        System.out.println(collect2);


    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        if (set.size() == list.size()) {
            return false;
        }
        return true;
    }

}
