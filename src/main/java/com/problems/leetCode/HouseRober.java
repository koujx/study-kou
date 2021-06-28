package com.problems.leetCode;

/**
 * created by koujx on 2016/3/15.
 * #198. House Robber
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
 * stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount
 * of money you can rob tonight without alerting the police.
 */
public class HouseRober {

	public int rob(int[] nums) {
		int length = nums.length;
		if (length == 0) return 0;
		if (length == 1) return nums[0];
		if (length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];
		else {
			int pre1 = nums[0];
			int cur = nums[0] > nums[1] ? nums[0] : nums[1];
			int pre2 = cur;
			for (int i = 2; i < length; i++) {
				if (pre2 > pre1) {
					if (pre2 < pre1 + nums[i]) {
						cur = pre1 + nums[i];
						int temp = cur;
						pre1 = pre2;
						pre2 = temp;
					} else {
						pre1 = pre2;
					}
				} else {
					cur = pre1 + nums[i];
					int temp = cur;
					pre1 = pre2;
					pre2 = temp;
				}
			}
			return cur;
		}
	}

	/*
	//递归，Time Limit Exceeded
	public int rob(int[] nums) {
		int length = nums.length;
		if (length == 0) return 0;
		if (length == 1) return nums[0];
		if (length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];
		else {
			int[] num1 = new int[length - 1];
			int[] num2 = new int[length - 2];
			num1[0] = nums[2];
			for (int i = 3; i < length; i++) {
				num1[i - 2] = nums[i];
				num2[i - 3] = nums[i];
			}
			int result1 = nums[0] + rob(num1);
			int result2 = nums[1] + rob(num2);
			return result1 > result2 ? result1 : result2;
		}
	}
*/
}
