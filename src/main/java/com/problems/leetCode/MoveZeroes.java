package com.problems.leetCode;

/**
 * created by koujx on 2016/1/26.
 * #283.Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the
 * non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        else {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = 0;
            }
            return;
        }
    }
    /*    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            break;
                        }
                    }
                }
            }
        }
    }*/
}
