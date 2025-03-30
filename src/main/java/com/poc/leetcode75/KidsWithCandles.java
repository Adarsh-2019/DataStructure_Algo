package com.poc.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandles {
    public static void main(String[] args) {
        int candles[]={2,3,5,1,3};
        int extra=3;
        List<Boolean> booleanList = kidsWithCandles(candles, extra);
        System.out.println(booleanList);
    }

    private static List<Boolean> kidsWithCandles(int[] candles, int extra) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<candles.length;i++){
            if (candles[i]>max){
                max=candles[i];
            }
        }

        List<Boolean> result=new ArrayList<>();
        for (int j=0;j<candles.length;j++){
            if ((candles[j]+extra)>=max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
