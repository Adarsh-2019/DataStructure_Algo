package com.poc.test;

public class SwapTwoStringWithThird {
    public static void main(String[] args) {
        String s1="JAVA";
        String s2="J2EE";
        swapString(s1,s2);
    }

    private static void swapString(String s1, String s2) {
        s1=s1+s2; //JAVAJ2EE
        s2=s1.substring(0,s1.length()-s2.length()); //JAVA
        s1=s1.substring(s2.length());  //J2EE

        System.out.println(s1);
        System.out.println(s2);

    }
}
