package com.poc.test;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        reverseEachWordOfString("I am string not reversed");
    }

    private static void reverseEachWordOfString(String inputString) {
        String str[]=inputString.split(" ");
        String reverseString="";
        for (String word:str){
            String revereWord="";
            for (int i=word.length()-1;i>=0;i--){
                revereWord=revereWord+word.charAt(i);
            }
            reverseString=reverseString+revereWord+" ";
        }
        System.out.println(reverseString);
    }
}