package com.poc.com.poc.logical;

public class IntegerPalindrome {

    public static void main(String[] args) {
        int n=12321;
        checkPalindrome(n);
    }

    private static void checkPalindrome(int num) {
        int n=num;
        int rem=1, rev=0;

        while (n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if (num==rev){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
}
