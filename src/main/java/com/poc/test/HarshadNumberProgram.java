package com.poc.test;

public class HarshadNumberProgram {
    public static void main(String[] args) {
        int number=123;
        findHarshadNumber(number);
    }

    private static void findHarshadNumber(int number) {

        int copyOfNumber=number;
        int lastDigit=0;
        int sum=0;
        while (number>0){
         lastDigit=number%10;
         sum=sum+lastDigit;
         number=number/10;
        }
        if (copyOfNumber%sum==0){
            System.out.println("This is Harshad Number: "+number);
        }else{
            System.out.println("This is not Harshad number: "+number);
        }
    }
}








