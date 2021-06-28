package com.Sort;

/**
 * Created by koujx on 2016/5/17.
 * 冒泡排序：
 * 基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * <p/>
 * 最差时间分析	平均时间复杂度	稳定度	空间复杂度
 * O(n^2)	        O(n^2)   	稳定  	O(1)
 */
public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j - 1] > nums[j]) {
                        int temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }
}
