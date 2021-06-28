package com.Sort;

/**
 * Created by koujx on 2016/5/17.
 * 直接插入排序：
 * 基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），
 * 直到全部插入排序完为止。
 * <p/>
 * 最差时间分析	平均时间复杂度	稳定度	空间复杂度
 * O(n2)	    O(n2)   	    稳定     O(1)
 */
public class InsertionSort {
    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];   //待插入的元素
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (nums[j] > temp) {
                    nums[j + 1] = nums[j];
                } else break;
            }
            nums[j + 1] = temp;
        }
    }
}
