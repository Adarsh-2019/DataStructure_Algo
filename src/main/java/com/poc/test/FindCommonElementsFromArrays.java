package com.poc.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsFromArrays {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        findCommonString(s1, s2);
    }

    private static void findCommonString(String[] str1, String[] str2) {
        /*Set<String> commonString=new HashSet<>() ;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].equals(str2[j])){
                  commonString.add(str1[i]);
              }
            }
        }
        System.out.println(commonString);
    }*/

        Set<String> commonString=new HashSet<>();
        Set<String> set1 = new HashSet<>(Arrays.asList(str1));
        //commonString = Arrays.stream(str2).filter(set1::contains).collect(Collectors.toSet());
        for (String s1 : str2) {
            if (set1.contains(s1)) {
                commonString.add(s1);
            }
        }
        System.out.println(commonString);

    }
}
