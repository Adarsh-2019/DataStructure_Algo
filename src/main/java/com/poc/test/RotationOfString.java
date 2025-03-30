package com.poc.test;

public class RotationOfString {
    public static void main(String[] args) {
        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";
        checkString(s1, s2);
    }

    private static void checkString(String str1, String str2) {

        String s3 = str1 + str1;
        if (s3.contains(str2)) {
            System.out.println("String is rotation of the other string");
        } else {
            System.out.println("String is not rotation of the other string");
        }
    }
}
