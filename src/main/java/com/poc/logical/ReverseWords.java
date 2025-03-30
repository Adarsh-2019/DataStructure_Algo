package com.poc.logical;

public class ReverseWords {
    public static void main(String[] args) {
        String[] str = "This is a very good ..!".split(" ");
        String reverseWords = reverseWords(str);
        System.out.println(reverseWords);
    }

    //Approach 1
    private static String  reverseWords(String[] str) {

        String output="";
        for (int i=str.length-1;i>=0;i--){
          output=output+str[i]+" ";
        }
        return output;
    }

    //Approach 2

}