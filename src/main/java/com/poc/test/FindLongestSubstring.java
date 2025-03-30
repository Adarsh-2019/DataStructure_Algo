package com.poc.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubstring {
    public static void main(String[] args) {
        longestSubstring("thelongestsubstring");
    }

    private static void longestSubstring(String inputString) {
        char[] charArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;

        Map<Character, Integer> charPosMap = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String: " + inputString);
        System.out.println("Longest Sub-string:" + longestSubstring);
        System.out.println("Longest Sub-string length: " + longestSubstringLength);
    }
}




