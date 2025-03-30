package com.poc.test;

public class FindLeaderInArray {
    public static void main(String[] args) {
        findTheLeaders(new int[]{55, 67, 71, 57, 91, 63, 38});
    }

    private static void findTheLeaders(int[] inputArray) {
        int leaderMax = inputArray[inputArray.length - 1];
        for (int i = 0; i < inputArray.length - 2; i++) {
            if (inputArray[i]>leaderMax){
                System.out.println(inputArray[i]);
                leaderMax=inputArray[i];
            }
        }
    }
}
