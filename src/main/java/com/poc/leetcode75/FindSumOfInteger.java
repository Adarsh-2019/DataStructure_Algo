package com.poc.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfInteger {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 5, 15};
        int sum = 10;
        int[] ints = twoSum(arr, sum);
        for (int i = 0; i < ints.length; i++) {
            System.out.printf(ints[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
