package com.problems.leetCode;

/**
 * created by koujx on 2016/1/28.
 * #169.Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than
 * [n/2] times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    //Vote
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int count = 0;
        int majorE = nums[0];
        for (int i = 0; i < length; i++) {
            if (count == 0) {
                majorE = nums[i];
                count++;
            } else if (majorE == nums[i + 1]) {
                count++;
            } else count--;
        }
        return majorE;
    }

/*有序数组的中位数就是Ϊmajority element
    public int majorityElement(int[] nums){
        int length = nums.length;
        if (length==1) return nums[0];
        Arrays.sort(nums);
        return nums[length/2];
    }
*/

/*    public int majorityElement(int[] nums) {
        int length = nums.length;
        if(length==1)return nums[0];
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < length-1; i++) {
            if(nums[i]==nums[i+1]) count++;
            else count =1;
            if (count>length/2) return nums[i];
        }
        return 0;
    }*/
}
