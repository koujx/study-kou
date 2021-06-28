package com.Sort;

/**
 * Created by koujx on 2016/5/17.
 * 归并排序
 * 基本思想:归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 * <p/>
 * 最差时间分析	平均时间复杂度	稳定度	空间复杂度
 * O(nlog2n)    O(nlog2n)       稳定     O(1)
 */
public class MergeSort {
    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            //对左边进行递归
            mergeSort(nums, left, middle);
            //对右边进行递归
            mergeSort(nums, middle + 1, right);
            //合并
            merge(nums, left, middle, right);
        }
    }

    private static void merge(int[] nums, int left, int middle, int right) {
        int[] tmpArr = new int[nums.length];
        int mid = middle + 1; //右边的起始位置
        int tmp = left;
        int third = left;
        while (left <= middle && mid <= right) {
            //从两个数组中选取较小的数放入中间数组
            if (nums[left] <= nums[mid]) {
                tmpArr[third++] = nums[left++];
            } else {
                tmpArr[third++] = nums[mid++];
            }
        }
        //将剩余的部分放入中间数组
        while (left <= middle) {
            tmpArr[third++] = nums[left++];
        }
        while (mid <= right) {
            tmpArr[third++] = nums[mid++];
        }
        //将中间数组复制回原数组
        while (tmp <= right) {
            nums[tmp] = tmpArr[tmp++];
        }
    }
}
