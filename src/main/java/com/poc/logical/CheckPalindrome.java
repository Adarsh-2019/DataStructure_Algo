package com.poc.logical;

public class CheckPalindrome {

    public static boolean isPalindrome(String str) {
        int start=0;
        int ends=str.length()-1;
        char[] chars = str.toCharArray();
        if(str.length()>1){
        while (start<ends){
            if(chars[start]!=chars[ends]){
              return false;
            }
            start++;
            ends--;
        }
        return true;
    }else {
            return false;
        }
    }

    public static void main(String[] args) {
     String str="madam";
        boolean palindrome = isPalindrome(str);
        if(palindrome) {
            System.out.println("This is a palindrome : "+str);
        }else {
            System.out.println("This is not a palindrome : "+str);
        }
    }
}
