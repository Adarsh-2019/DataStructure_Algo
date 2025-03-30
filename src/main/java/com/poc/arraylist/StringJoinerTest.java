package com.poc.arraylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringJoinerTest {
    public static void main(String[] args) {
        /* //add prefix and sufix
        StringJoiner joiner=new StringJoiner(",","#","#");
        joiner.add("Interview");
        joiner.add("Questions");
        joiner.add("Answers");
        System.out.println(joiner);*/

        /* generate 10 random number
        Random random=new Random();
        System.out.println("Below are 10 random numbers ->");
        random.ints().limit(10).forEach(System.out::println);*/

        /*// iterate list of string
        List<String> str = Arrays.asList("Hello","Interview","Questions","Answers");
        str.stream().forEach(System.out::println);*/

        //find minimum number of a list

        /*List<Integer> list=Arrays.asList(1,2,4,5,7,1,12,6,01);
        Integer integer = list.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.printf("Minimum Number -> "+integer);*/

        /*//find min
        int arr[]={12,3,4,23,56,88,12,11};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.printf("min :"+ min);*/

        //find max
        /*List<Integer> list=Arrays.asList(1,2,4,5,7,1,12,6,11);
        Integer integer = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(integer);*/

        //find second highest number
        //List<Integer> list=Arrays.asList(1,2,4,5,7,1,12,6,11);
        /*Integer secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);*/

        /*Integer secondHighestNumber = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
        System.out.println(secondHighestNumber);*/

        /*//find whose length greater than 3
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");
        //stringList.stream().filter(str -> str.length() >3).forEach(System.out::println);
        stringList.stream().filter(str->str.endsWith("S".toLowerCase(Locale.ROOT))).forEach(System.out::println);*/

        /*//multiple of 3
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream().map(num -> num*3).collect(Collectors.toList()));
        //list.stream().map(integer -> integer*3).forEach(System.out::println);*/

        /*//concatenation of two stream
        List<Integer> integerList1 = Arrays.asList(1,3,2,4);
        List<Integer> integerList2 = Arrays.asList(6,5,7);
        Stream.concat(integerList1.stream().sorted(),integerList2.stream().sorted()).forEach(System.out::println);*/

        /*//remove duplicate elements from the list
        List<Integer> integerList = Arrays.asList(1,2,3,4,1,2,3);
        Set<Integer> integers=new HashSet<>();
        //integerList.stream().filter(num->!integers.add(num)).forEach(System.out::println);
        integerList.stream().distinct().forEach(System.out::println);*/

        /*//find unique elements
        List<Integer> integerList = Arrays.asList(1,6,2,3,4,1,2,3,5);
        Map<Integer, Long> collect = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<Integer, Long>> entryStream = collect.entrySet().stream().filter(entry -> entry.getValue() == 1).collect(Collectors.toList());

        for (Map.Entry<Integer,Long> entry:entryStream){
            System.out.println(entry.getKey());
        }*/

        /*//find current time, date, date and time
        System.out.println("Date: "+ LocalDate.now());
        System.out.println("Time: "+ LocalTime.now());
        System.out.println("Date and Time: "+ LocalDateTime.now());*/

        /*//sort the give list
        //List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","For");
        stringList.stream().sorted().forEach(System.out::println);*/

        /*//sum of all numbers
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        double v = integerList.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(v);*/

        /*//do qube and find greater than 50
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(num->num*num*num).filter(i->i>50).forEach(System.out::println);*/

        /*List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","For");
        //Collections.sort(stringList,(s1,s2)->s1.compareTo(s2));
        Collections.sort(stringList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(stringList);*/

        //sort string with its length
        //List<String> list = Arrays.asList("Kartik4", "batra6565", "karan", "Rishi657", "Jon");
        //list.stream().sorted((s1,s2)->Integer.compare(s1.length(),s2.length())).forEach(System.out::println);

        /*Runnable task=()-> System.out.println("runnable execute");
        new Thread(task).start();*/

        List<String> list = Arrays.asList("Kartik", "Batra", "Karan", "Rishi", "Jon");
        /*String s = list.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(s);*/

        /*Integer integer = list.stream().map(String::length).min(Integer::compare).get();
        System.out.println(integer);*/

        /*//find even number along with e and o
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        List<String> collect = integerList.stream().map(num -> num % 2 == 0 ? num + "e" : num + "o").collect(Collectors.toList());
        System.out.println(collect);*/
      /* ArrayList<Integer> list1=new ArrayList<Integer>(){{
          add(1);
          add(2);
          add(4)    ;
       }};
        System.out.println(list1);*/

        /*//find Fibonacci series
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(10).map(f->f[0])
                .forEach(System.out::println);*/
    }
}
