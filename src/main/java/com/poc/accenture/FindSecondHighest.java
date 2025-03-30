package com.poc.accenture;

public class FindSecondHighest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70,100};
        int secondHighestNumber = secondHighestNumber(numbers);
        System.out.println(secondHighestNumber);
    }

    private static int secondHighestNumber(int[] numbers) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:numbers){
            if (num>max){
                secondMax=max;
                max=num;
            }else if (num>secondMax){
                secondMax=num;
            }
        }

        return secondMax;
    }
}
