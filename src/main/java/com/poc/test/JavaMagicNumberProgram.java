package com.poc.test;

public class JavaMagicNumberProgram {

    public static void main(String[] args) {
        int number = 1252;
        isMagicNumber(number);
    }

    private static void isMagicNumber(int inputNumber) {
        int copyOfNumber = inputNumber;
        int sum = 0;
        int lastDigit;
        while (sum > 9 || inputNumber > 0) {

            if (inputNumber == 0) {
                inputNumber = sum;
                sum = 0;
            }
            lastDigit = inputNumber % 10;
            sum = sum + lastDigit;
            inputNumber = inputNumber / 10;
        }
        if (sum == 1) {
            System.out.println(copyOfNumber + " is a magic number ");  //1252
        } else {
            System.out.println(+copyOfNumber + " is not a magic number ");  //1748
        }
    }
}
