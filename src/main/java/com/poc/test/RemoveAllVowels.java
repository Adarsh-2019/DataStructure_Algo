package com.poc.test;

public class RemoveAllVowels {
    public static void main(String[] args) {
        String str="Java Concept Of The Day";
        removeAllVowels(str);
    }

    private static void removeAllVowels(String str) {
        String removeVowels = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println(removeVowels);
    }
}
