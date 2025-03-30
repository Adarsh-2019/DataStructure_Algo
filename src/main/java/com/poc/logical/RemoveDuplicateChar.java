package com.poc.logical;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str="abcdabcgfgfghhs";
        removeDuplicate(str);
    }

    private static void removeDuplicate(String str) {
        char chars[]=str.toCharArray();
        Set<Character> presents=new LinkedHashSet<>();
        int len=0;
        for (char ch:chars){
            presents.add(ch);
        }
        System.out.println(presents);
    }
}
