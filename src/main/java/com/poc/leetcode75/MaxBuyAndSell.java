package com.poc.leetcode75;

public class MaxBuyAndSell {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int min=prices[0];
        int profit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);
        }
        System.out.printf("Max profit = "+profit);
    }
}
