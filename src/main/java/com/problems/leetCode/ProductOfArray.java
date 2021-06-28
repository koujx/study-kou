package com.problems.leetCode;

/**
 * Created by koujx on 2016/4/15.
 * #238. Product of Array Except Self
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * For example, given [1,2,3,4], return [24,12,8,6].
 */
public class ProductOfArray {
    //先找到数组中的0
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int zero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        if (zero != -1) {
            int product = 1;
            for (int i = 0; i < zero; i++) {
                product *= nums[i];
            }
            for (int i = zero + 1; i < nums.length; i++) {
                product *= nums[i];
            }
            products[zero] = product;
        }else {
            int product = 1;
            for (int i = 0; i < nums.length; i++) {
                product*=nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                products[i] = product/nums[i];
            }
        }
        return products;
    }
}
