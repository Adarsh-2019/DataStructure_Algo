package com.poc.com.poc.logical;

public class StringPalindrom {
    public static void main(String[] args) {
        String str = "This is This";
       // boolean palindrome = palindrome(str);
        /*boolean palindrome = palindrome( strings);
        if (palindrome) {
            System.out.println("This is a palindrome : " + str);
        }else {
            System.out.println("This is not a palindrome : " + str);
        }*/
        String[] strings=str.split(" ");
        boolean palindrome = palindrome(strings);
        if (palindrome) {
            System.out.println("This is a palindrome : " + str);
        }else {
            System.out.println("This is not a palindrome : " + str);
        }
    }

    private static boolean palindrome(String[] str) {
       int i=0, j= str.length-1;

       while (i<j){
           if (!str[i].equals(str[j])){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }

    /*private static boolean palindrome(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }*/
}
