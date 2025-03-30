package com.poc.system;

public class Main {
    public static void main(String[] args) {
        String str=null;
        System.out.println(str);

        /*String str="Hi ";
        StringBuffer bu=new StringBuffer(str);
        bu.append("Hello");
        System.out.println(bu);*/

        /*
        String str = "123";

        int num1 = Integer.parseInt(str); // Returns int
        Integer num2 = Integer.valueOf(str); // Returns Integer

        int sum = num2 + 456; // Direct arithmetic with int
        // int sum = num2 + 456; // Autounboxing occurs here

        System.out.println("ParseInt :"+num1); // Output: 123
        System.out.println("ValueOf :"+num2); // Output: 123

        System.out.println(sum); // Output: 579
        */
        //String[] array = {"Apple", "Banana", "Cherry"};
        //List<String> list= Arrays.asList(array);
        //Arrays.stream(array).collect(Collectors.toList()).forEach(System.out::println);
        /*
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        Object[] objects = list.toArray();
        for (Object str:objects){
            System.out.println(str);
        }
        */

        /*
        String str="thisisgoodprogramming";
        List<String> list = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(f -> f.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        //System.out.println(list);

        //find first non repeated char
        String chars = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(chars);
        */

        /*
        int arrays[]={2,1,6,8,3,11,44,12,0};
        Integer first = Arrays.stream(arrays).boxed().sorted().skip(1).findFirst().get();
        System.out.println(first);
        */

        /*
        String stringList[]={"java","python","microservices","spring boot", "up"};
        //longest string from given string
        String word = Arrays.stream(stringList).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(word);
        */
    }
}
