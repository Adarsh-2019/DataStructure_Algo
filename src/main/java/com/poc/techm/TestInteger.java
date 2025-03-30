package com.poc.techm;

public class TestInteger {
    public static void main(String[] args) {
        /*
        In Java, when you create Integer objects using autoboxing for values in the
        range of -128 to 127, the Java compiler
         caches these values and reuses the same Integer objects for subsequent requests.
         */
        /*Integer i1=128;
        Integer i2=128;
        System.out.println(i1==i2);
        */

        /*
        Both are created in difference memory location
         */
        /*Integer i3=10;
        Integer i4=new Integer(10);
        System.out.println(i3==i4); //false*/

        /*
        //compile time error, should need to initialized with string type values because it is local variable
        String s;
        System.out.println(s.length());*/
        /*
        reference to String is ambiguous
  both constructor String(java.lang.StringBuffer) in java.lang.String and
  constructor String(java.lang.StringBuilder) in java.lang.String match
         */
        /*String s=new String(null);
        System.out.println(s);*/

    }
}
