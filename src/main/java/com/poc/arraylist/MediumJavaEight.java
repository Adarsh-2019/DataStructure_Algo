package com.poc.arraylist;

import java.util.Arrays;
import java.util.List;

public class MediumJavaEight {
    /*public static boolean test(int num[]){
    int nums[]={1,3,2,4,1,2,6};
    List<Integer> list = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());
    Set<Integer> set = new HashSet<>(list);
    if(set.size() == list.size()) {
        return false;
    }
    return true;
}*/
    public static void main(String[] args) {

        //int nums[]={1,3,2,4,1,2,6};
        //System.out.println(test(nums));
        /*//find even numbers
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);*/

        /*//find numbers start with 1
        List<String> myList = Arrays.asList("10","15","8","49","25","18","32");
        myList.stream().map(s->s+"").filter(str->str.startsWith("1")).forEach(System.out::println);*/

        /*//find duplicate
        List<Integer> myList = Arrays.asList(10,15,8,10,49,25,98,98,32,15);
        Set<Integer>  list=new HashSet<>();
        myList.stream().filter(s->!list.add(s)).forEach(System.out::println);*/

        //List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        //int first = myList.stream().findFirst().get();
        //System.out.println(first);

        //long count = myList.stream().count();
        //System.out.println(count);

        //Integer integer = myList.stream().max(Integer::compare).get();
        //System.out.println(integer);

        /*//find non-repeated char
        String input = "Java articles are Awesome";
        Character character = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(character);*/

       /* //find first repeated char
        String input = "Java Articles are Awesome";
        Character character = input.chars().mapToObj(s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(character);*/

       /* //sort integer
        List<Integer> listIntegers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        listIntegers.stream().sorted().forEach(System.out::println);
        //listIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);*/

        List<String> stringList = Arrays.asList("Hello", "Interview", "Questions", "Answers", "Ram", "For");
        /*Map<String, Long> longMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(longMap);*/

        /*int n=1213;
        String str = String.valueOf(n);
        boolean noneMatch = IntStream.rangeClosed(0, str.length()/2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        if (noneMatch){
            System.out.println("This is a palindrome number");
        }else {
            System.out.println("This is  not a palindrome number");

        }*/

        /*int n = 153;
        String str = String.valueOf(n);
        int noOfDigits = str.length();
        int sum = str.chars().map(Character::getNumericValue).map(digit -> (int) Math.pow(digit, noOfDigits)).sum();
        if (n == sum) {
            System.out.println("This is armstrong number");
        } else {
            System.out.println("This is not a armstrong number");
        }*/

        /*int n=5;
        int factorial = IntStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
        System.out.println(factorial);*/

        String str="java is good programming language";
        String reduce = str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (s1, s2) -> s2 + s1);
        System.out.println(reduce);
    }

}
