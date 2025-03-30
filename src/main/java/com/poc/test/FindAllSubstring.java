package com.poc.test;

public class FindAllSubstring {
    public static void main(String[] args) {
        String str="java";
        findAllSubstring(str);
    }

    private static void findAllSubstring(String input) {

        for (int i=0;i<input.length();i++){
            for (int j=i+1;j<=input.length();j++){
                System.out.println(input.substring(i,j));
            }
        }
    }
}