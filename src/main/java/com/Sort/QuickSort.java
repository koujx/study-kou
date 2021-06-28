package com.Sort;

/**
 * Created by koujx on 2016/5/17.
 * 快速排序
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,
 * 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 * <p/>
 * 最差时间分析	平均时间复杂度	稳定度	空间复杂度
 * O(n^2)    	O(n*log2n)  	不稳定	O(log2n)~O(n)
 */
public class QuickSort {
    private static void quickSort(int[] nums) {
        if (nums.length > 0) {
            quickSort(nums, 0, nums.length - 1);
        }
    }

    public static void quickSort1(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];
        while (l < h) {
            while (l < h && arr[h] >= povit) {
                h--;
            }
            while (l < h && arr[l] <= povit) {
                l++;
            }
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
            }
        }

        int temp = arr[h];
        arr[h] = arr[low];
        arr[low] = temp;

        if (l > low) quickSort1(arr, low, l - 1);
        if (h < high) quickSort1(arr, l + 1, high);
    }

    public static void quickSort(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];
        while (l < h) {
            while (l < h && arr[h] >= povit) {
                h--;
            }
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit) {
                l++;
            }
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        if (l > low) quickSort(arr, low, l - 1);
        if (h < high) quickSort(arr, l + 1, high);
    }

    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Double.valueOf(Math.random() * 100).intValue();
            System.out.println(nums[i]);
        }
        System.out.println("========Sort========");
        quickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
