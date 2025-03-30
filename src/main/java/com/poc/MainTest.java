package com.poc;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        String str="gopalganj";
        String output="";

        for (int i=0;i<str.length();i++){
            if (!output.contains(String.valueOf(str.charAt(i)))){
                output=output+(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(output);

        List<Integer> list=new ArrayList<>();
        /*
        String input = "aaabbbcccddd";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!output.contains(String.valueOf(input.charAt(i)))) {
                output += String.valueOf(input.charAt(i));
            }
        }
        System.out.println(output);

         */

        /*List<Integer> list= Arrays.asList(500,700,100,200,400,300,800);
        list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);*/
    }
}
