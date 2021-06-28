package com.problems.leetCode;

import java.util.Arrays;

/**
 * created by koujx on 2016/1/27.
 * #217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any
 * value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;//比直接使用nums.length的时间开销减小
        if (length <= 1) return false;
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

/*
    public boolean containsDuplicate(int[] nums) {
        if (nums==null||nums.length==0)return false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) return true;
            else list.add(nums[i]);
        }
        return false;
    }
*/
}
