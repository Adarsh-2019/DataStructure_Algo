package com.poc.leetcode75;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqrst";
        String mergeString = mergeStringAlternately(str1, str2);
        System.out.println(mergeString);
    }

    private static String mergeStringAlternately(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1, len2);
        String longestString = "";
        if (min == len1) {
            longestString = str2;
        } else if (min == len2) {
            longestString = str1;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
        }
        sb.append(longestString.substring(min));
        return sb.toString();
    }
}
