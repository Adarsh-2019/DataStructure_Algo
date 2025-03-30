package com.poc.leetcode75;

public class ReverseVowelChars {
    public static void main(String[] args) {
        String word="Leetcode";
        String reverseString = reverseString(word);
        System.out.println(reverseString);
    }

    private static String reverseString(String word) {
        int start=0;
        int end=word.length()-1;
        String vowels="AEIOUaeiou";
        char chars[]=word.toCharArray();
        while (start<end){
            while (start<end && vowels.indexOf(chars[start])==-1){
                start++;
            }
            while (start<end && vowels.indexOf(chars[end])==-1){
                end--;
            }
            char ch=chars[start];
            chars[start]=chars[end];
            chars[end]=ch;
            start++;
            end--;
        }
        return new String(chars);
    }
}
