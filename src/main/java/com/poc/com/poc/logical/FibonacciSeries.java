package com.poc.com.poc.logical;

public class FibonacciSeries {

    //print Fibonacci using recursive method
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        //fib(n);
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }

    //
    /*private static void   fib(int n) {
       *//*int n1=0, n2=1;
       int n3;
       int counter=0;

        while (counter<n){
            System.out.println(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            counter++;
       }*//*
    }*/
}
