package com.problems.leetCode;

/**
 * Created by koujx on 2016/4/15.
 * #152. Maximum Product Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProduct {
    public int maxProduct(int[] nums) {
        if (nums.length==0)return 0;
        if (nums.length==1)return nums[0];
        int maxP = 1;
        int count = 0;
        int first = 0;
        int last = 0;
        int zero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            } else if (nums[i] < 0) {
                if (count == 0) {
                    first = i;
                    last = i;
                } else last = i;
                count++;
            }
        }
        if (zero != -1) {
            int[] nums1 = new int[zero];
            int[] nums2 = new int[nums.length - zero - 1];
            System.arraycopy(nums, 0, nums1, 0, zero);
            System.arraycopy(nums, zero + 1, nums2, 0, nums.length - zero - 1);
            maxP = Math.max(0, Math.max(maxProduct(nums1), maxProduct(nums2)));
        } else if (count % 2 == 0) {
            for (int i = 0; i < nums.length; i++) {
                maxP *= nums[i];
            }
        } else {
            int firstProduct = 1;
            int lastProduct = 1;
            for (int i = 0; i < last; i++) {
                firstProduct *= nums[i];
            }
            for (int i = first + 1; i < nums.length; i++) {
                lastProduct*=nums[i];
            }
            maxP = Math.max(firstProduct,lastProduct);
        }
        return maxP;
    }

    public static void main(String[] args){
        int[] nums = {-2,0,-1};
        System.out.println(new MaximumProduct().maxProduct(nums));
    }
}
