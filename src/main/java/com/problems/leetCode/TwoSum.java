package com.problems.leetCode;

import java.util.HashMap;

/**
 * created by koujx on 2016/1/26.
 * #1.Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1
 * must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashN = new HashMap<Integer, Integer>();
        int[] index = new int[]{0, 0};
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (hashN.containsKey(value)) {
                index[0] = hashN.get(value);
                index[1] = i;
                break;
            }
            hashN.put(nums[i], i);
        }
        return index;
    }
}
