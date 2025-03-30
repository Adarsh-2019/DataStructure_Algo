package com.poc.test;

public class ReverseAddPalindrome {
    public static void main(String[] args) {
        int number = 7325;
        reverseAndAdd(number);
    }

    //check palindrome number
    private static boolean checkPalindrome(int inputNumber) {

        int number = inputNumber;
        int reverseNumber = reverseNumber(inputNumber);
        if (number == reverseNumber) {
            return true;
        } else {

            return false;
        }
    }

    //reverse the given number
    private static int reverseNumber(int number) {
        int sum = 0;
        int rem = 0;
        while (number > 0) {
            rem = number % 10;
            sum = sum * 10 + rem;
            number = number / 10;
        }
        return sum;
    }

    public static void reverseAndAdd(int number) {
        if (checkPalindrome(number)) {
            System.out.println("This is already a palindrome number: " + number);
        } else {
            while (!checkPalindrome(number)) {
                int reverseNumber = reverseNumber(number);
                int sum = reverseNumber + number;
                System.out.println(number + "+" + reverseNumber + "= " + sum);
                number = sum;
            }
        }
    }
}