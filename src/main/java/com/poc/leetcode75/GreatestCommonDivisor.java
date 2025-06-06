package com.poc.leetcode75;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        String str1="ABAB";
        String str2="AB";
        String greatestSubstring = gcdOfString(str1, str2);
        System.out.println(greatestSubstring);
    }

    private static String gcdOfString(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();
        if (!(str1+str2).equals(str2+str1))
            return "--";
        String result = str1.substring(0, gcd(len1, len2));
        return result;
    }

    private static int gcd(int num1, int num2) {
        if (num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}
