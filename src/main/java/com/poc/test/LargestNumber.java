package com.poc.test;

public class LargestNumber {
    public static void main(String[] args) {
        int lLessThanN = getLLessThanN(98512, 5);
        System.out.println(lLessThanN);
    }

    static int getLLessThanN(int number, int digit) {
        char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i) {
            if (Integer.toString(i).indexOf(c) == -1) {
                return i;
            }
        }
        return -1;
    }
}
