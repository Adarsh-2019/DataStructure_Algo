package com.poc.com.poc.logical;

public class CheckArmstrong {
    public static void main(String[] args) {
        //153, 371
        int num=500;
        for (int i=1;i<=num;i++) {
            if(checkArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }

    private static boolean checkArmstrong(int n) {
        int num = n;
        int rem = 0;
        int sum = 0;
            while (num > 0) {
                rem = num % 10;
                sum = sum + rem * rem * rem;
                num = num / 10;
            }
            if (sum == n) {
                return true;
            } else {
                return false;
            }
        }
}
