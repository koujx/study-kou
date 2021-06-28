package com.Sort;

/**
 * Created by koujx on 2016/5/17.
 * 简单选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * <p/>
 * 最差时间分析	平均时间复杂度	稳定度	空间复杂度
 * O(n^2)	    O(n^2)	        稳定	    O(1)
 */
public class SelectionSort {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;    //最小数的索引
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) min = j;
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }
        }
    }
}